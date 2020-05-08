package com.sqli.servicemysqlkubernetes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sqli.servicemysqlkubernetes.data.User;
import com.sqli.servicemysqlkubernetes.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;
    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    @GetMapping("/id")
    public User getAllUsers(Long id){
        return userRepository.findById(id).orElseThrow();
    }
}
