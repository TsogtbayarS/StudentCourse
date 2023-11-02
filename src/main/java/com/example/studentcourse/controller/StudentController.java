package com.example.studentcourse.controller;

import com.example.studentcourse.entity.Course;
import com.example.studentcourse.entity.Student;
import com.example.studentcourse.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@Api(value = "Student Management System", description = "Operations pertaining to students in Student Management System")
public class StudentController {
    @Autowired
    private StudentService service;

    @GetMapping("")
    @ApiOperation(value = "Get a list of all students")
    public List<Student> getAllStudents(@RequestParam(name = "major", required = false) String major) {
        if (major != null) {
            return service.getStudentsByMajor(major);
        }
        return service.getAllStudents();
    }

    @GetMapping("/init")
    public List<Student> init() {
        return service.initializeSampleStudents();
    }

    @GetMapping("/{studentId}")
    @ApiOperation(value = "Get a student by ID")
    public Student getStudentById(@PathVariable int studentId) {
        return service.getStudentById(studentId);
    }

    @PostMapping("")
    @ApiOperation(value = "Add a student")
    public Student addStudent(@RequestBody Student student) {
        return service.createStudent(student);
    }

    @PutMapping("/{studentId}")
    @ApiOperation(value = "Edit a student by ID")
    public Student updateStudentById(@PathVariable int studentId, @RequestBody Student student) {
        return service.updateStudent(studentId, student);
    }

    @DeleteMapping("/{studentId}")
    @ApiOperation(value = "Delete a student by ID")
    public Student removeStudent(@PathVariable int studentId) {
        return service.deleteStudent(studentId);
    }

    @GetMapping("/courses")
    @ApiOperation(value = "Get all courses of the student")
    public List<Course> getCoursesByStudentId(@RequestParam(name = "id") int id) {
        return service.getCoursesByStudentId(id);
    }
}

