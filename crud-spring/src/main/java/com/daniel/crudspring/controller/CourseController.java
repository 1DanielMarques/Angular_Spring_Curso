package com.daniel.crudspring.controller;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    public ResponseEntity<List<Course>> findAll() {
        List<Course> list = repository.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Course> findById(@PathVariable Long id) {
        return repository.findById(id).map(c -> ResponseEntity.ok().body(c)).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Course create(@RequestBody Course c) {
        return repository.save(c);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Course> update(@PathVariable Long id, @RequestBody Course course) {
        return repository.findById(id).map(c -> {
            c.setName(course.getName());
            c.setCategory(course.getCategory());
            Course updated = repository.save(c);
            return ResponseEntity.ok().body(updated);
        }).orElse(ResponseEntity.notFound().build());

    }

}
