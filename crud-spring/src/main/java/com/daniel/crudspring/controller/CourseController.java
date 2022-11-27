package com.daniel.crudspring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daniel.crudspring.model.Course;

@RestController
@RequestMapping(value = "/api/courses")
public class CourseController {
    
    @GetMapping
    public List<Course> findAll(){
        return null;
    }

}
