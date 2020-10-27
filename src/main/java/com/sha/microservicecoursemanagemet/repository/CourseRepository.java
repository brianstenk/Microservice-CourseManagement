package com.sha.microservicecoursemanagemet.repository;

import com.sha.microservicecoursemanagemet.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
