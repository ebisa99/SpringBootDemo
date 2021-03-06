package com.Springboot.SpringDemo.controller;

import com.Springboot.SpringDemo.dto.CourseDto;
import com.Springboot.SpringDemo.service.CourseService;
import org.springframework.web.bind.annotation.*;

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
    public void deleteCourse(@PathVariable Integer id){
        courseService.deleteById(id);
    }

    @GetMapping("/course1/{id}")
    public Optional<CourseDto> getStudentById(@PathVariable Integer id){
        Optional<CourseDto> optionalCourse = courseService.getById(id);
        if(optionalCourse.isPresent()){
            return  optionalCourse;
        }
        return null;
    }
}
