package com.Springboot.SpringDemo.studentDao;

import com.Springboot.SpringDemo.studentDto.CourseDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<CourseDto, String> {
}
