package com.example.testapp.controller;

import com.example.testapp.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {
    private final TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/test")
    public Map<String, String> testMethod() {
        Map<String, String> responseMap = new HashMap<>();

        responseMap.put("test",testService.getData());
        return responseMap;
    }
}
