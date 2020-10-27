package com.sha.microservicecoursemanagemet.service;

import com.sha.microservicecoursemanagemet.model.Course;
import com.sha.microservicecoursemanagemet.model.Transaction;

import java.util.List;

public interface CourseService {
    Course findCourseById(Long courseId);

    List<Transaction> findTransactionsOfUser(Long userId);

    List<Transaction> findTransactionsOfCourse(Long courseId);

    Transaction saveTransaction(Transaction transaction);

    List<Course> allCourses();
}
