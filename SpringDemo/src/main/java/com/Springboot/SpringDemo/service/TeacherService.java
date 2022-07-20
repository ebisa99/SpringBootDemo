package com.Springboot.SpringDemo.service;
import com.Springboot.SpringDemo.dto.TeacherDto;
import com.Springboot.SpringDemo.repository.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {
    private TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }
    public List<TeacherDto> getAllTeachers(){
        return teacherRepository.findAll();
    }

    public TeacherDto addTeacher(TeacherDto teacherDto){
        return teacherRepository.save(teacherDto);
    }

    public Optional<TeacherDto> getById(Integer id){
        return teacherRepository.findById(id);
    }

    public void deleteById(Integer id){
        teacherRepository.deleteById(id);
    }
}
