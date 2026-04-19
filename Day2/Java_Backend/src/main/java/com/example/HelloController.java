package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Hello from sony! iam Java Backend and  happly auto deplyed using cicd software - 19/04/2026 🚀";
    }

    @GetMapping("/status")
    public String status() {
        return "Application is running!";
    }
}
