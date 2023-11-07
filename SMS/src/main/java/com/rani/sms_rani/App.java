package com.rani.sms_rani;

import java.util.List;

import jpa.entitymodels.Course;
import jpa.service.CourseService;
import jpa.service.StudentService;

/**
 * My own trial class
 * 
 *
 */
public class App {
	public static void main(String[] args) {
		fireQueries();
	}

	private static void fireQueries() {
		// TODO Auto-generated method stub
		List<Course> allCourses = new CourseService().getAllCourses();
		System.out.println("=======================allCourses() start ----------");
		System.out.println("allCourses=" + allCourses);
		System.out.println("=======================allCourses() Ended ----------");

		StudentService studentService = new StudentService();
		
		System.out.println("=======================getAllStudents() start ----------");
		System.out.println("All Students=" + studentService.getAllStudents());
		System.out.println("=======================getAllStudents() Ended ----------");

		System.out.println("=======================getStudentByEmail() start ----------");
		System.out.println("Get getStudentByEmail=" + studentService.getStudentByEmail("aiannitti7@is.gd"));
		System.out.println("=======================getStudentByEmail() Ended ----------");
		
		System.out.println("=======================getStudentCourses() start ----------");
		System.out.println("Get getStudentCourses=" + studentService.getStudentCourses("aiannitti7@is.gd"));
		System.out.println("=======================getStudentCourses() Ended ----------");

		System.out.println("=======================validateStudent() start ----------");
		System.out.println("Get validateStudent=" + studentService.validateStudent("aiannitti7@is.gd", "TWP4hf5j"));
		System.out.println("=======================validateStudent() Ended ----------");

		System.out.println("=======================registerStudentToCourse() start ----------");
		studentService.registerStudentToCourse("aiannitti7@is.gd", 1);
		System.out.println("=======================registerStudentToCourse() Ended"
				+ " ----------");

	}

}
