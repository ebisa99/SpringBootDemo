package com.Springboot.SpringDemo.studentDao;

import com.Springboot.SpringDemo.studentDto.StudentDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentDto, Integer> {

}
