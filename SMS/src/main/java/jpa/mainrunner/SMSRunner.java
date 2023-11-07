package jpa.mainrunner;

import java.util.List;
import java.util.Scanner;

import jpa.entitymodels.Course;
import jpa.service.CourseService;
import jpa.service.StudentService;

public class SMSRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Are you a(n)");
		System.out.println("       1.   Student");
		System.out.println("       2.   quit");
		System.out.println("Please, enter 1 or 2.");

		Scanner scanner = new Scanner(System.in);
		int mainOption = scanner.nextInt();
		if (mainOption == 1) {
			System.out.print("Enter Your Email:");
			String email = scanner.next();
			System.out.print("Enter Your Password:");
			String password = scanner.next();
			StudentService studentService = new StudentService();
			boolean validate = studentService.validateStudent(email, password);
			if (validate) {
				List<Course> studentCourses = studentService.getStudentCourses(email);

				System.out.println("My  Classes");
				System.out.println("#   COURSE NAME     INSTRUCTOR NAME");
				for (Course course : studentCourses) {
					System.out
							.println(course.getcId() + "  " + course.getcName() + "    " + course.getcInstructorName());
				}
				System.out.println("Please Select-");
				System.out.println("1- Register to Class.");
				System.out.println("2- Logout.");
				int option = scanner.nextInt();
				if (option == 1) {
					CourseService courseService = new CourseService();
					List<Course> allCourses = courseService.getAllCourses();
					for (Course course : allCourses) {
						System.out.println(course.getcId() + "    " + course.getcName() + "         "
								+ course.getcInstructorName());
					}
					System.out.println("\"Please select courseID\"");
					int inputCourseId = scanner.nextInt();
					boolean isRegistered = studentService.isStudentAlreadyRegistered(email, inputCourseId);

					if (isRegistered) {
						System.out.println("\"You are already registered in this course.\"");
					} else {
						studentService.registerStudentToCourse(email, inputCourseId);
					}

					List<Course> updatedList = studentService.getStudentCourses(email);
					System.out.println("My  Classes");
					System.out.println("#   COURSE NAME     INSTRUCTOR NAME");
					for (Course course : updatedList) {
						System.out.println(
								course.getcId() + " " + course.getcName() + "       " + course.getcInstructorName());
					}
					System.out.println("Thank you.");

				} else if (option == 2) {
					System.out.println("Logout: Thanks, You have been logged out.");
				}
			} else {
				System.out.println("Invalid credentials. Please try again.");
			}
		} else if (mainOption == 2) {
			System.out.println("Quit: thank you!");

		}

		scanner.close();
	}
}
