package com.example.studentcourse.service.impl;

import com.example.studentcourse.entity.Course;
import com.example.studentcourse.repository.CourseRepo;
import com.example.studentcourse.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepo courseRepository;

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.getAllCourses();
    }

    @Override
    public List<Course> init() {
        courseRepository.initializeSampleCourses();
        return courseRepository.getAllCourses();
    }

    @Override
    public Course getCourseById(int courseId) {
        return courseRepository.getCourseById(courseId);
    }

    @Override
    public Course createCourse(Course course) {
        return courseRepository.createCourse(course);
    }

    @Override
    public Course updateCourse(int courseId, Course course) {
        return courseRepository.updateCourse(courseId, course);
    }

    @Override
    public Course deleteCourse(int courseId) {
        return courseRepository.deleteCourse(courseId);
    }
}

