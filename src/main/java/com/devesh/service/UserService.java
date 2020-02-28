package com.devesh.service;

import java.util.List;

import com.devesh.model.User;

public interface UserService {

    User save(User user);
    List<User> findAll();
    void delete(long id);
}
