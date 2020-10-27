package com.sha.microservicecoursemanagemet.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
@Data
@Entity
@Table(name="course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name ="title")
    private String title;
    @Column(name="author")
    private String author;
    @Column(name="category")
    public String category;
    @Column(name="publish_date")
    private LocalDateTime publishDate;

}
