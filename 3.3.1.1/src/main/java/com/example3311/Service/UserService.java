package com.example3311.Service;

import com.example3311.model.User;

import java.util.List;

public interface UserService {

    List<User> users();

    void add(User user);

    void remove(long id);

    void edit(User user);

    User getUserById(long id);
}
