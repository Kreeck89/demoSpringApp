package com.example.hillel.demospringapp.service;

import com.example.hillel.demospringapp.entity.User;

import java.util.List;

public interface UserService {

    public List<User> getUsers();

    void save(User user);
}
