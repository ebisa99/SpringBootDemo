package com.Springboot.SpringDemo.studentController;

import com.Springboot.SpringDemo.studentDto.StudentDto;
import com.Springboot.SpringDemo.studentService.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/api/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<StudentDto> getStudentString(){
        return studentService.getAllStudents();
    }

    @PostMapping("/addStudent")
    public StudentDto addStudent(@RequestBody StudentDto studentDto){
        return studentService.addStudent(studentDto);
    }

    @DeleteMapping("/stud/{id}")
    public void deleteStudent(@PathVariable  Integer id){
        studentService.deleteStudent(id);
    }

    @GetMapping("/student1/{id}")
    public Optional<StudentDto> getStudentById(@PathVariable Integer id){
        Optional<StudentDto> optionalStudent = studentService.getStudentById(id);
        if(optionalStudent.isPresent()){
            return  optionalStudent;
        }
        return null;
    }
}