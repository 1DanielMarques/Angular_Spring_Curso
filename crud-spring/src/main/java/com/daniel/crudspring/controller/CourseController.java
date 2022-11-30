package com.daniel.crudspring.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.daniel.crudspring.model.Course;
import com.daniel.crudspring.repository.ICourseRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(value = "/api/courses")
@AllArgsConstructor
public class CourseController {

    private final ICourseRepository repository;

    @GetMapping
    public List<Course> findAll() {
        return repository.findAll();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Course create(@RequestBody Course c) {
        return repository.save(c);
    }

}
