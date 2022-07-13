package com.Springboot.SpringDemo.repository;

import com.Springboot.SpringDemo.dto.CourseDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<CourseDto, Integer>{
}
