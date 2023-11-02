package com.example.studentcourse.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class Course {
    @ApiModelProperty(notes = "The unique ID of the course")
    private int id;
    @ApiModelProperty(notes = "The name of the course")
    private String name;
    @ApiModelProperty(notes = "The code of the course")
    private String code;

    public Course(int id, String name, String code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }
}
