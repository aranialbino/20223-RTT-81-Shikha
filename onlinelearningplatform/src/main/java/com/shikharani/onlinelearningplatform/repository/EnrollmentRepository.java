package com.shikharani.onlinelearningplatform.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shikharani.onlinelearningplatform.model.Enrollment;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {

	public List<Enrollment> findByCourseId(Long courseId);

	public List<Enrollment> findByCourseIdAndStudentId(Long courseId, Long studentId);

}
