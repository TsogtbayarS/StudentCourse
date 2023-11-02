package com.example.studentcourse.service.impl;

import com.example.studentcourse.entity.Course;
import com.example.studentcourse.entity.Student;
import com.example.studentcourse.repository.StudentRepo;
import com.example.studentcourse.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepo studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.getAllStudents();
    }

    @Override
    public Student getStudentById(int studentId) {
        return studentRepository.getStudentById(studentId);
    }

    @Override
    public Student createStudent(Student student) {
        return studentRepository.createStudent(student);
    }

    @Override
    public Student updateStudent(int studentId, Student student) {
        return studentRepository.updateStudent(studentId, student);
    }

    @Override
    public Student deleteStudent(int studentId) {
        return studentRepository.deleteStudent(studentId);
    }

    @Override
    public List<Student> initializeSampleStudents() {
        studentRepository.initializeSampleStudents();
        return studentRepository.getAllStudents();
    }

    @Override
    public List<Student> getStudentsByMajor(String major) {
        return studentRepository.getStudentsByMajor(major);
    }

    @Override
    public List<Course> getCoursesByStudentId(int id) {
        List<Course> courses = studentRepository.getCoursesByStudentId(id);
        return courses;
    }
}

