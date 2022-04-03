package com.example.login.repository;

import com.example.login.entity.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void FindAll(){  // 返回给前端的
        System.out.println(userRepository.findAll());
        for (Users user:userRepository.findAll()){
            System.out.println("------------------------1");
            System.out.println(user.getClass());
            System.out.println(user);
            System.out.println(user.getUsername());
            System.out.println(user.getPassword());
            System.out.println("------------------------2");
        }
    }

}