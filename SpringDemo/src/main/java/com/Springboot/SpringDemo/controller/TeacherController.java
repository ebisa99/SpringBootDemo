package com.Springboot.SpringDemo.controller;

import com.Springboot.SpringDemo.dto.TeacherDto;
import com.Springboot.SpringDemo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }
    @GetMapping("/teachers")
    public List<TeacherDto> getTeacherString(){
        return teacherService.getAllTeachers();
    }

    @PostMapping("/addTeacher")
    public TeacherDto addTeacher(@RequestBody TeacherDto teacherDto){
        return teacherService.addTeacher(teacherDto);
    }

    @DeleteMapping("/teacher1/{id}")
    public void deleteTeacher(@PathVariable  Integer id){
        teacherService.deleteById(id);
    }
    @GetMapping("/teacher1/{id}")
    public Optional<TeacherDto> getStudentById(@PathVariable Integer id){
        Optional<TeacherDto> optionalTeacher = teacherService.getTeacherById(id);
        if(optionalTeacher.isPresent()){
            return  optionalTeacher;
        }
        return null;
    }
}
