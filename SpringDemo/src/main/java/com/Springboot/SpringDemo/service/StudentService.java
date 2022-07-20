package com.Springboot.SpringDemo.service;

import com.Springboot.SpringDemo.repository.StudentRepository;
import com.Springboot.SpringDemo.dto.StudentDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class StudentService {
    private StudentRepository studentRepository;
    @Value("${student.scores}")
    private List<String> scores;
    //practice Optional data
    private Map<String, Integer> courseScores = new HashMap<>();
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<StudentDto> getAllStudents(){
        return studentRepository.findAll();
    }

    public Integer[] getScores(){
        Integer[] myScores = new Integer[3];
        for(int i = 0; i < scores.size(); i++){
            if(scores != null) {
                myScores[i] = Integer.parseInt(scores.get(i).split(":")[1]);
            }
        }
        return myScores;
    }
    //practice Optional data
    private Map<String, Integer> populateMap(){
        courseScores.put("math", 100);
        courseScores.put("cs", 95);
        courseScores.put("Geo", 90);
        return courseScores;
    }
    //practice Optional data
    public Integer getScore(){
        return Optional.ofNullable(populateMap().get("cs")).get().intValue();
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
