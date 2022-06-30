package com.Springboot.SpringDemo.studentService;

import com.Springboot.SpringDemo.studentDao.StudentRepository;
import com.Springboot.SpringDemo.studentDto.StudentDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<StudentDto> getAllStudents(){
        return studentRepository.findAll();
    }

    public Optional<StudentDto> getStudentById(Integer id){
        return studentRepository.findById(id);
    }

    public void deleteStudent(Integer id){
        studentRepository.deleteById(id);
    }

    public StudentDto addStudent(StudentDto studentDto){
        return studentRepository.save(studentDto);
    }
}
