package com.myproject;

import com.myproject.config.AppConfig;
import com.myproject.model.User;
import com.myproject.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        User coala = new User();
        coala.setLogin("NotABear1999");
        coala.setEmail("coala@downunderworld.au");
        userService.add(coala);

        User kangaroo = new User();
        kangaroo.setLogin("Marsupial1988");
        kangaroo.setEmail("kangaroo@downunderworld.au");
        userService.add(kangaroo);

        userService.listUsers().forEach(System.out::println);
    }
}
