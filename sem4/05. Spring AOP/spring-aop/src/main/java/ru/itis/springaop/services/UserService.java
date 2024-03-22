package ru.itis.springaop.services;

import ru.itis.springaop.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void createMockUsers();
}
