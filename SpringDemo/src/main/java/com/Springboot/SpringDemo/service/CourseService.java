package com.Springboot.SpringDemo.service;

import com.Springboot.SpringDemo.studentDao.CourseRepository;
import com.Springboot.SpringDemo.studentDto.CourseDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    private CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<CourseDto> getAllCourses(){
        return courseRepository.findAll();
    }

    public CourseDto addCourse(CourseDto courseDto){
        return courseRepository.save(courseDto);
    }

    public Optional<CourseDto> getById(String id){
        return courseRepository.findById(id);
    }

    public void deleteById(String id){
        courseRepository.deleteById(id);
    }
}
