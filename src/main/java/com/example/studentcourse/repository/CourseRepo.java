package com.example.studentcourse.repository;

import com.example.studentcourse.entity.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseRepo{
    private List<Course> courses = new ArrayList<>();
    public void initializeSampleCourses() {
        Course course1 = new Course(1, "Introduction to Programming", "COMP101");
        Course course2 = new Course(2, "Data Structures and Algorithms", "COMP201");
        Course course3 = new Course(3, "Calculus I", "MATH101");

        // Add the sample courses to the list
        courses.add(course1);
        courses.add(course2);
        courses.add(course3);
    }
    public List<Course> getAllCourses() {
        return courses;
    }

    public Course getCourseById(int courseId) {
        List<Course> courses = getAllCourses();
        for (Course c : courses) {
            if (c.getId() == courseId) {
                return c;
            }
        }
        return null;
    }

    public Course createCourse(Course course) {
        courses.add(course);
        return course;
    }

    public Course updateCourse(int courseId, Course course) {
        List<Course> courses = getAllCourses();
        for (Course c : courses) {
            if (c.getId() == courseId) {
                c.setId(course.getId());
                c.setCode(course.getCode());
                c.setName(course.getName());
                return c;
            }
        }
        return null;
    }

    public Course deleteCourse(int courseId) {
        List<Course> courses = getAllCourses();
        for (Course c : courses) {
            if (c.getId() == courseId) {
                courses.remove(c);
                return c;
            }
        }
        return null;
    }
}
