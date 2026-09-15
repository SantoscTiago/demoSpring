package com.demo.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public TestService() {}

    public String test() {
        return "TestService";
    }
}
