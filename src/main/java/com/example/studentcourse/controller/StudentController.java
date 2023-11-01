package com.example.studentcourse.controller;

import com.example.studentcourse.entity.Student;
import com.example.studentcourse.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    @Autowired
    private StudentService service;

    @GetMapping("")
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }
    @GetMapping("/init")
    public List<Student> init() {
        return service.initializeSampleStudents();
    }

    @GetMapping("/{studentId}")
    public Student getStudentById(@PathVariable int studentId) {
        return service.getStudentById(studentId);
    }

    @PostMapping("")
    public Student addStudent(@RequestBody Student student) {
        return service.createStudent(student);
    }
    @PutMapping("/{studentId}")
    public Student updateStudentById(@PathVariable int studentId,@RequestBody Student student) {
        return service.updateStudent(studentId, student);
    }
    @DeleteMapping("/{studentId}")
    public Student removeStudent(@PathVariable int studentId){
        return service.deleteStudent(studentId);
    }
}

