package com.example.NonLinearProgress;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {
    @RequestMapping("/")
    public String health(){
        return "A Ok";
    }
}
