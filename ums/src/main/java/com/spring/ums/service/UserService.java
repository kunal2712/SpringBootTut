package com.spring.ums.service;

import com.spring.ums.entity.User;

import java.util.List;

public interface UserService {

    User createUser(User user);

    User getUserById(Long id);

    List<User> getAllUsers();

    User updateUser(User user);

    User deleteUser(Long id);
}
