package com.myproject.service;

import com.myproject.model.User;
import java.util.List;

public interface UserService {
    void add(User user);

    List<User> listUsers();
}
