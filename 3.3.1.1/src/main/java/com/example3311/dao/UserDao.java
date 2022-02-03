package com.example3311.dao;

import com.example3311.model.User;

import java.util.List;

public interface UserDao {
    List<User> users();
    void add(User user);
    void remove(long id);
    void edit(User user);
    User getUserById(long id);
}
