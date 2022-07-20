package com.Springboot.SpringDemo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name="Teacher")
public class TeacherDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer teacherId;
    private String teacherName;
}
