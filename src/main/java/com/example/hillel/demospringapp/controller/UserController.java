package com.example.hillel.demospringapp.controller;

import com.example.hillel.demospringapp.entity.User;
import com.example.hillel.demospringapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public List<User> getAll() {
        return userService.getUsers();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void save(@RequestBody User user) {
        userService.save(user);
    }
}
