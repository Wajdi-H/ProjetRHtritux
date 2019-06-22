package com.example.demo.Service;

import com.example.demo.entity.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
