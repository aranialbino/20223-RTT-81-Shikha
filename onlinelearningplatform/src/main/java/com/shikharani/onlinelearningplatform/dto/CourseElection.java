package com.shikharani.onlinelearningplatform.dto;

import lombok.Data;

@Data
public class CourseElection {

	private Long courseId;
	private Long departmentId;
	private String departmentName;
	private String title;
	private String description;
	private String instructor;
	private String duration;
	private String difficultyLevel;

}
