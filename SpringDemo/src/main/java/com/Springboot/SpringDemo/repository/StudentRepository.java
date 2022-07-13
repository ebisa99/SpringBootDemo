package com.Springboot.SpringDemo.repository;

import com.Springboot.SpringDemo.dto.StudentDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentDto, Integer> {

}
