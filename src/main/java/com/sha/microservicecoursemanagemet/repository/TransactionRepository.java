package com.sha.microservicecoursemanagemet.repository;

import com.sha.microservicecoursemanagemet.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findAllByUserId(Long userId);
    List<Transaction> findAllByCourseId(Long courseId);
}
