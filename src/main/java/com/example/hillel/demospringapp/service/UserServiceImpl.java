package com.example.hillel.demospringapp.service;

import com.example.hillel.demospringapp.entity.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<User> getUsers() {
        return Arrays.asList(
                new User("Alex", "Bobovich", "alex@mail.ua"),
                new User("Denis", "Denisov", "denis@mail.ua"),
                new User("Bohdan", "Bohdanov", "bohdan@mail.ua"));
    }

    @Override
    public void save(User user) {
        System.out.println(user.toString());
    }
}
