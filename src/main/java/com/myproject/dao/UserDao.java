package com.myproject.dao;

import com.myproject.model.User;
import java.util.List;

public interface UserDao {
    void add(User use);

    List<User> getAll();
}
