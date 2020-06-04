package com.myproject.controller;

import com.myproject.UserResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello123";
    }

    @GetMapping("/userDto")
    public UserResponseDto getUser() {
        UserResponseDto userResponseDto = new UserResponseDto();
        userResponseDto.setName("Dima");
        userResponseDto.setEmail("notyourbuddy@poznyaki.com");
        return userResponseDto;
    }
}
