package com.example.studentcourse.service;

import com.example.studentcourse.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentById(int studentId);
    Student createStudent(Student student);
    Student updateStudent(int studentId, Student student);
    Student deleteStudent(int studentId);
    List<Student> initializeSampleStudents();
}
