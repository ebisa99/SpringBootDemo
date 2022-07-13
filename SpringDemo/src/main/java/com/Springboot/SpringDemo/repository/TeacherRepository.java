package com.Springboot.SpringDemo.repository;

import com.Springboot.SpringDemo.dto.TeacherDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<TeacherDto, Integer> {
}
