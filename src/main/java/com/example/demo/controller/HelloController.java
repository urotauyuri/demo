package com.example.demo.controller;

import com.example.demo.entity.Sample;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    public Sample hello() {
        Sample sample = new Sample();
        sample.setId(100);
        sample.setName("Ryutaro");
        return sample;
    }
}