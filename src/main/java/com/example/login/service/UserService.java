package com.example.login.service;

import com.example.login.model.User;

import java.util.List;

public interface UserService {

    User findById(String userId);

    User findByName(String name);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserById(String userId);

    void deleteAllUsers();

    List<User> findAllUsers();

    boolean isUserExist(User user);
}