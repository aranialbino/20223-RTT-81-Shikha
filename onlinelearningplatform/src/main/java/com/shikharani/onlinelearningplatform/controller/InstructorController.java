package com.shikharani.onlinelearningplatform.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.shikharani.onlinelearningplatform.dto.InstructorData;
import com.shikharani.onlinelearningplatform.model.Course;
import com.shikharani.onlinelearningplatform.model.Enrollment;
import com.shikharani.onlinelearningplatform.model.User;
import com.shikharani.onlinelearningplatform.model.UserRole;
import com.shikharani.onlinelearningplatform.repository.EnrollmentRepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class InstructorController extends CommonController {

	@Autowired
	EnrollmentRepository enrollmentRepo;

	@RequestMapping(value = "/updateProgress", method = { RequestMethod.GET, RequestMethod.POST })
	public String updateProgressOfStudent(@RequestParam String studentId, @RequestParam String courseId,
			@RequestParam String newProgress, Model model, HttpSession session) {
		User user = getUserObject(session);
		if (user == null || user.getRole() != UserRole.INSTRUCTOR)
			return "/login";

		Enrollment enrollment = new Enrollment();
		enrollment.setProgress(Integer.valueOf(newProgress));
		Enrollment enrollmentEntity = enrollmentRepo
				.findByCourseIdAndStudentId(Long.valueOf(courseId), Long.valueOf(studentId)).get(0);
		enrollmentEntity.setProgress(Integer.valueOf(newProgress));
		enrollmentRepo.save(enrollmentEntity);
		model.addAttribute("successMessage", "Progress is updated successfully.");
		return "forward:/instructorHome";
	}

	@RequestMapping(value = "/instructorHome", method = { RequestMethod.GET, RequestMethod.POST })
	public String gotoInstructorHome(Model model, HttpSession session) {
		User user = getUserObject(session);
		if (user == null || user.getRole() != UserRole.INSTRUCTOR)
			return "/login";

		List<Course> instructorCoursesList = user.getCourses();
		List<InstructorData> instructorDataList = new ArrayList();
		if (instructorCoursesList != null && instructorCoursesList.size() > 0) {
			int courseSize = instructorCoursesList.size();
			for (int i = 0; i < courseSize; i++) {
				Course course = instructorCoursesList.get(i);
				// Get number of students enrolled to this course.
				List<Enrollment> courseEnrollmentList = enrollmentRepo.findByCourseId(course.getId());
				if (courseEnrollmentList != null && courseEnrollmentList.size() > 0) {
					for (int j = 0; j < courseEnrollmentList.size(); j++) {
						Enrollment enrollment = courseEnrollmentList.get(j);
						User student = enrollment.getStudent();
						InstructorData instructorData = new InstructorData();
						instructorData.setSerialNum(instructorDataList.size() + 1);
						if (course.getDepartment() != null) {
							instructorData.setDepartment(course.getDepartment().getName());
						}
						instructorData.setCourseId(course.getId().toString());
						instructorData.setCourseTitle(course.getTitle());
						instructorData.setCourseDescription(course.getDescription());
						instructorData.setStudentId(student.getId().toString());
						instructorData.setStudentName(student.getFName() + " " + student.getLName());
						instructorData.setProgress(enrollment.getProgress());
						instructorData.setShowUpdate(true);
						instructorDataList.add(instructorData);
					}
				} else {
					InstructorData instructorData = new InstructorData();
					instructorData.setSerialNum(instructorDataList.size() + 1);
					if (course.getDepartment() != null) {
						instructorData.setDepartment(course.getDepartment().getName());
					}
					instructorData.setCourseId(course.getId().toString());
					instructorData.setCourseTitle(course.getTitle());
					instructorData.setCourseDescription(course.getDescription());
					instructorData.setStudentId("-");
					instructorData.setStudentName("-");

					instructorData.setShowUpdate(false);
					instructorDataList.add(instructorData);
				}
			}
		} else {
			model.addAttribute("errorMessage", "No course is available.");
		}

		model.addAttribute("instructorDataList", instructorDataList);
		return "instructorHome";
	}

}
