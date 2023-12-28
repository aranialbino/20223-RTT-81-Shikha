package com.shikharani.onlinelearningplatform.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.shikharani.onlinelearningplatform.constants.CommonUtil;
import com.shikharani.onlinelearningplatform.dto.CourseElection;
import com.shikharani.onlinelearningplatform.dto.StudentData;
import com.shikharani.onlinelearningplatform.model.Course;
import com.shikharani.onlinelearningplatform.model.Enrollment;
import com.shikharani.onlinelearningplatform.model.User;
import com.shikharani.onlinelearningplatform.model.UserRole;
import com.shikharani.onlinelearningplatform.repository.CourseRepository;
import com.shikharani.onlinelearningplatform.repository.EnrollmentRepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class StudentController extends CommonController {

	@Autowired
	private CourseRepository courseRepository;

	@Autowired
	private EnrollmentRepository enrollmentRepository;

	@RequestMapping(value = "/enrollToCourse", method = { RequestMethod.GET, RequestMethod.POST })
	public String enrollToCourse(@RequestParam String courseId, @RequestParam("startDate") String startDateStr,
			Model model, HttpSession session) {
		System.out.println("Inside enrollToCourse");
		User user = getUserObject(session);
		if (user == null || user.getRole() != UserRole.STUDENT)
			return "/login";

		if (courseId == null || courseId.length() == 0 || startDateStr == null || startDateStr.length() == 0
				|| convertDate(startDateStr) == null) {
			System.out.println("Required data is null.");
			return "forward:/newCourseRegistrationHome";
		}

		Date startDate = convertDate(startDateStr);
		Long userId = CommonUtil.getUserIdFromSession(session);
		Enrollment enrollment = new Enrollment();
		enrollment.setCourse(new Course(Long.parseLong(courseId)));
		enrollment.setProgress(0);
		enrollment.setStartDate(startDate);
		enrollment.setStudent(new User(userId));
		enrollmentRepository.save(enrollment);
		model.addAttribute("successMessage", "You have been successfully enrolled to the course.");
		return "forward:/newCourseRegistrationHome";
	}

	@RequestMapping(value = "/newCourseRegistrationHome", method = { RequestMethod.GET, RequestMethod.POST })
	public String gotoNewCourseRegistrationHome(Model model, HttpSession session) {
		System.out.println("Inside gotoNewCourseRegistrationHome");
		User user = getUserObject(session);
		if (user == null || user.getRole() != UserRole.STUDENT)
			return "/login";
		List<Enrollment> studentCourses = user.getStudentCourses();
		Set<Long> courseIdsAlreadyEnrolled = getCourseIds(studentCourses);
		List<Course> allCoursesList = courseRepository.findAll(Sort.by(Sort.Direction.DESC, "department", "id"));
		List<CourseElection> courseElectionList = new ArrayList();

		for (int i = 0; i < allCoursesList.size(); i++) {
			Course course = allCoursesList.get(i);
			if (courseIdsAlreadyEnrolled.contains(course.getId())) {
				// This course is already selected by user.
				continue;
			}
			CourseElection courseElection = new CourseElection();
			courseElection.setCourseId(course.getId());
			courseElection.setDepartmentId(course.getDepartment().getId());
			courseElection.setDepartmentName(course.getDepartment().getName());
			courseElection.setTitle(course.getTitle());
			courseElection.setDescription(course.getDescription());
			courseElection.setInstructor(course.getInstructor().getFName() + " " + course.getInstructor().getLName());
			courseElection.setDuration(course.getDuration() + " months");
			courseElection.setDifficultyLevel(course.getDifficultyLevel() + "/10");
			courseElectionList.add(courseElection);
		}

		if (courseElectionList == null || courseElectionList.size() == 0) {
			System.out.println("No course is available to enroll.");
			model.addAttribute("errorMessage", "No course is available.");
		}
		model.addAttribute("courseElectionList", courseElectionList);
		return "newCourseRegistration";
	}

	@RequestMapping(value = "/studentHome", method = { RequestMethod.GET, RequestMethod.POST })
	public String gotoStudentHome(Model model, HttpSession session) {
		User user = getUserObject(session);
		if (user == null || user.getRole() != UserRole.STUDENT)
			return "/login";

		List<Enrollment> studentCourses = user.getStudentCourses();
		List<StudentData> studentsDataList = new ArrayList();
		if (studentCourses != null) {
			int coursedEnrolledSize = studentCourses.size();
			for (int i = 0; i < coursedEnrolledSize; i++) {
				Enrollment enrolledCourse = studentCourses.get(i);
				Course course = enrolledCourse.getCourse();

				StudentData studentData = new StudentData();
				studentData.setSerialNum(i + 1);

				if (course.getDepartment() != null) {
					studentData.setDepartment(course.getDepartment().getName());
				}
				studentData.setTitle(course.getTitle());
				studentData.setDescription(course.getDescription());
				studentData.setInstructor(course.getInstructor().getFName() + " " + course.getInstructor().getLName());
				studentData.setStartDate(enrolledCourse.getStartDate() + "");
				studentData.setProgress(enrolledCourse.getProgress() + "%");
				studentsDataList.add(studentData);
			}
		}
		if (studentsDataList == null || studentsDataList.size() == 0) {
			model.addAttribute("errorMessage", "Not registered to any course.");
		}
		model.addAttribute("studentsDataList", studentsDataList);
		return "studentHome";
	}

	private Set<Long> getCourseIds(List<Enrollment> userCoursesSelected) {
		Set<Long> set = new HashSet();
		for (Enrollment c : userCoursesSelected) {
			set.add(c.getCourse().getId());
		}
		return set;
	}

	private Date convertDate(String dateStr) {
		try {
			return new SimpleDateFormat("MM/dd/yyyy").parse(dateStr);
		} catch (Exception e) {
			System.out.println("Date parsing failed. dateStr= " + dateStr);
		}
		return null;
	}
}
