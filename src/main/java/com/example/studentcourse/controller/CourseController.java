package com.example.studentcourse.controller;

import com.example.studentcourse.entity.Course;
import com.example.studentcourse.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
    @Autowired
    private CourseService service;

    @GetMapping("")
    public List<Course> getCourses(){
        return service.getAllCourses();
    }

    @GetMapping("/init")
    public List<Course> init(){
        return service.init();
    }
    @GetMapping("/{id}")
    public Course getCourse(@PathVariable int id){
        return service.getCourseById(id);
    }

    @PostMapping("")
    public Course addCourse(@RequestBody Course course){
        return service.createCourse(course);
    }

    @PutMapping("/{id}")
    public Course updateCourse(@PathVariable int id, @RequestBody Course course){
        return service.updateCourse(id, course);
    }

    @DeleteMapping("/{id}")
    public Course deleteCourse(@PathVariable int id){
        return service.deleteCourse(id);
    }
}
