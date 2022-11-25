package com.daniel.crudspring.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
    
@GetMapping(value = "/test")
public ResponseEntity<String> hello(){
    return ResponseEntity.ok().body("Hello, World!");
}

}
