package com.shikharani.onlinelearningplatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shikharani.onlinelearningplatform.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
