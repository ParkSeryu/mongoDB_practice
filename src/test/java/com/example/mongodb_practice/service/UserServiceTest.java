package com.example.mongodb_practice.service;

import com.example.mongodb_practice.entity.User;
import com.example.mongodb_practice.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class UserServiceTest {
    UserService userService;

    @Autowired
    private UserRepository userRepository;

    @BeforeEach
    public void beforeEach() {
        userService = new UserService(userRepository);
    }

    @Test
    public void getAllUser() {
        User user1 = new User();
        user1.setName("test1");
        userRepository.save(user1);

        User user2 = new User();
        user2.setName("test2");
        userRepository.save(user2);

        List<User> userList = userRepository.findAll();
        for (User user : userList) {
            System.out.println(user.getName());
        }

        assertThat(userList.size()).isEqualTo(2);
    }

    @Test
    public void updateUser(){

    }


}