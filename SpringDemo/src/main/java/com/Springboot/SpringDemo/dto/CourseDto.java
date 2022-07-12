package com.Springboot.SpringDemo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Course")
public class CourseDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String courseId;
    private String courseName;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
}
