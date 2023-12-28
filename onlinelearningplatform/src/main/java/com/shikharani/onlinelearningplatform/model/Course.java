package com.shikharani.onlinelearningplatform.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "courses")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@NotBlank(message = "Title is required")
	private String title;

	@NotBlank(message = "Description is required")
	private String description;

	private String duration;

	private Integer difficultyLevel;

	@ManyToOne
	@JoinColumn(name = "department_id", nullable = false)
	private Department department;

	@ManyToOne
	@JoinColumn(name = "instructor", nullable = false)
	private User instructor;

	@OneToMany(mappedBy = "course")
	private List<Enrollment> studentCourses;// A user (STUDENT) can enroll to multiple courses.

	public Course(Long id) {
		this.id = id;
	}

}
