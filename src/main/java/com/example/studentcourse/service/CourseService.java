package com.example.studentcourse.service;


import com.example.studentcourse.entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> getAllCourses();
    List<Course> init();
    Course getCourseById(int courseId);
    Course createCourse(Course course);
    Course updateCourse(int courseId, Course course);
    Course deleteCourse(int courseId);
}