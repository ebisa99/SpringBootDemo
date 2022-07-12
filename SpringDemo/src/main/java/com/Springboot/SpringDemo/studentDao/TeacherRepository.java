package com.Springboot.SpringDemo.studentDao;

import com.Springboot.SpringDemo.studentDto.TeacherDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<TeacherDto, Integer> {
}
