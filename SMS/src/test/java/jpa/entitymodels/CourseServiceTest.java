package jpa.entitymodels;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import jpa.service.CourseService;

public class CourseServiceTest {

	@Test
	public void testGetAllCourses() {
		List<Course> allCourses = new CourseService().getAllCourses();
		Assertions.assertEquals(allCourses.size(), 10);
	}

}
