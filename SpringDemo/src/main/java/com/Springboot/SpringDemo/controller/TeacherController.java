package com.Springboot.SpringDemo.controller;
import com.Springboot.SpringDemo.dto.TeacherDto;
import com.Springboot.SpringDemo.service.TeacherService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("teacher")
public class TeacherController {
    TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }
    @GetMapping("teachers")
    public List<TeacherDto> getAllTeachers(){
        return teacherService.getAllTeachers();
    }
    @PostMapping("/addTeacher")
    public TeacherDto addTeacher(@RequestBody TeacherDto teacherDto){
        return teacherService.addTeacher(teacherDto);
    }
    @GetMapping("teacher1/{id}")
    public Optional<TeacherDto> getTeacherById(Integer id) {
        Optional<TeacherDto> optionalTeacher = teacherService.getById(id);
        if (optionalTeacher.isPresent()) {
            return optionalTeacher;
        }
        return null;
    }
    @DeleteMapping("teacher1/{id}")
    public void deleteTeacherById(Integer id){
        teacherService.deleteById(id);
    }
}
