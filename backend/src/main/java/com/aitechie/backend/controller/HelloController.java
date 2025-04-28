package com.aitechie.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class HelloController {

    // Apply CORS to a specific method
    @CrossOrigin(origins = "http://http://127.0.0.1/:8040")  // Allow frontend at this origin
    @GetMapping("/api/hello")
    public String hello() {
        return "Hello this message from Backend!";
    }
}


