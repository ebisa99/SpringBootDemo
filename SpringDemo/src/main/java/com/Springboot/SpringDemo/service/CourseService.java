package com.Springboot.SpringDemo.service;

import com.Springboot.SpringDemo.dto.CourseDto;
import com.Springboot.SpringDemo.repository.CourseRepository;
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

    public Optional<CourseDto> getById(Integer id){
        return courseRepository.findById(id);
    }

    public void deleteById(Integer id){
        courseRepository.deleteById(id);
    }
}
