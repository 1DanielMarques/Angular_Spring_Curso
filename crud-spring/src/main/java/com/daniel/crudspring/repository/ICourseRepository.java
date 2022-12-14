package com.daniel.crudspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daniel.crudspring.model.Course;

@Repository
public interface ICourseRepository extends JpaRepository<Course, Long>{
    
}
