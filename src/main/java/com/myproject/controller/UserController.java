package com.myproject.controller;

import com.myproject.model.User;
import com.myproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/inject")
    public String injectMockData() {
        User first = new User("Mercury", "firstToSun@universe.io");
        userService.add(first);

        User second = new User("Venus", "secondToSun@universe.io");
        userService.add(second);

        User third = new User("Earth", "thirdToSun@universe.io");
        userService.add(third);

        User forth = new User("Mars", "forthToSun@universe.io");
        userService.add(forth);

        return "Success: stars have aligned and warriors are here...";
    }

    @GetMapping("/get/{id}")
    public String get(@PathVariable Long id, @RequestParam String message) {
        return "user: #" + id + ". Message: " + message;
    }
}
