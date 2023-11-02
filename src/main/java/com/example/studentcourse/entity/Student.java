package com.example.studentcourse.entity;

import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class Student {
    @ApiModelProperty(notes = "The unique ID of the student")
    private int id;
    @ApiModelProperty(notes = "The first name of the student")
    private String firstName;
    @ApiModelProperty(notes = "The last name of the student")
    private String lastName;
    @ApiModelProperty(notes = "The email of the student")
    private String email;
    @ApiModelProperty(notes = "The major of the student")
    private String major;
    @ApiModelProperty(notes = "The gpa of the student")
    private double gpa;
    @ApiModelProperty(notes = "The taken courses of the student")
    private List<Course> coursesTaken;

    public Student(int id, String firstName, String lastName, String email, String major, double gpa, List<Course> coursesTaken) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.major = major;
        this.gpa = gpa;
        this.coursesTaken = coursesTaken;
    }
}