package com.sha.microservicecoursemanagemet.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

//Table relations
@Data
@Entity
@Table(name="transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="course_id", referencedColumnName = "id")
    private Course course;
    @Column(name="user_id")
    private Long userId;
    @Column(name="date_of_issue")
    private LocalDateTime dateOfIssue;

   // setDateOfIssue()

}
