package jpa.entitymodels;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import jpa.service.StudentService;

public class StudentServiceTest {

	StudentService studentService = new StudentService();

	@Test
	public void testGetAllStudents() {
		List<Student> allStudents = studentService.getAllStudents();
		Assertions.assertEquals(allStudents.size(), 10);
	}

	@Test
	public void testRegisterStudentToCourse() {
		studentService.registerStudentToCourse("cjaulme9@bing.com", 8);
		boolean studentAlreadyRegistered = studentService.isStudentAlreadyRegistered("cjaulme9@bing.com", 8);
		Assertions.assertEquals(true, studentAlreadyRegistered);

	}
}
