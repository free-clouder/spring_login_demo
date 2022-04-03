package com.example.login.controller;

import com.example.login.entity.Users;
import com.example.login.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@ResponseBody
@RestController
@RequestMapping("/users")
public class UsersHandle {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/findAll")  //  /users/findAll
    private boolean FindAll(
            @RequestParam("username") String username,
            @RequestParam("password") String password
    ) {
        for (Users user: userRepository.findAll()){
            if(username.equals(user.getUsername()) && password.equals(user.getPassword())){
                return true;
            }
        }
        return false;
    }
}
