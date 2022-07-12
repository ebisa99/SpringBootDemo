package com.Springboot.SpringDemo.controller;

import com.Springboot.SpringDemo.service.CourseService;
import com.Springboot.SpringDemo.dto.CourseDto;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/course")
public class CourseController {
    private CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }
    @GetMapping("/courses")
    public List<CourseDto> getStudentString(){
        return courseService.getAllCourses();
    }

    @PostMapping("/addCourse")
    public CourseDto addStudent(@RequestBody CourseDto courseDto){
        return courseService.addCourse(courseDto);
    }

    @DeleteMapping("/course1/{id}")
    public void deleteCourse(@PathVariable String id){
        courseService.deleteById(id);
    }

    @GetMapping("/course1/{id}")
    public Optional<CourseDto> getStudentById(@PathVariable String id){
        Optional<CourseDto> optionalCourse = courseService.getById(id);
        if(optionalCourse.isPresent()){
            return  optionalCourse;
        }
        return null;
    }
}
