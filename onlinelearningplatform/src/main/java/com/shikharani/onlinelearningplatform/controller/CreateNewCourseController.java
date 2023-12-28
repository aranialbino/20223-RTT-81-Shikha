package com.shikharani.onlinelearningplatform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shikharani.onlinelearningplatform.model.Course;
import com.shikharani.onlinelearningplatform.model.Department;
import com.shikharani.onlinelearningplatform.model.User;
import com.shikharani.onlinelearningplatform.model.UserRole;
import com.shikharani.onlinelearningplatform.repository.CourseRepository;
import com.shikharani.onlinelearningplatform.repository.DepartmentRepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class CreateNewCourseController extends CommonController {

	@Autowired
	private DepartmentRepository departmentRepo;

	@Autowired
	private CourseRepository courseRepo;

	@RequestMapping(value = "/gotoCreateCoursePage", method = { RequestMethod.GET, RequestMethod.POST })
	public String gotoCreateCoursePage(Model model, HttpSession session) {
		System.out.println("Inside gotoCreateCoursePage");
		User user = getUserObject(session);
		if (user == null || user.getRole() != UserRole.INSTRUCTOR) {
			System.out.println("Goto login");
			return "/login";
		}

		List<Department> allDepartmentsList = departmentRepo.findAll();
		model.addAttribute("deparmentList", allDepartmentsList);
		model.addAttribute("createNewCourseModel", new Course());

		return "createNewCourse";
	}

	@RequestMapping(value = "/saveNewCourse", method = { RequestMethod.GET, RequestMethod.POST })
	public String saveNewCourse(@ModelAttribute("createNewCourseModel") Course course, Model model,
			HttpSession session) {
		System.out.println("Inside saveNewCourse and course1= " + course);

		User user = getUserObject(session);
		if (user == null || user.getRole() != UserRole.INSTRUCTOR)
			return "/login";

		course.setInstructor(user);
		courseRepo.save(course);
		model.addAttribute("successMessage", "Course has been created successfully.");

		return "forward:/gotoCreateCoursePage";
	}
}
