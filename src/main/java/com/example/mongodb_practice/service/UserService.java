package com.example.mongodb_practice.service;

import com.example.mongodb_practice.entity.User;
import com.example.mongodb_practice.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    private UserRepository userRepository;

    public String getUserIdByUserName(String id) {
        return userRepository.findById(id).orElseThrow(IllegalAccessError::new).getId();
    }

    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(User user) {
        User findUser = userRepository.findUserByName(user.getName()).orElseThrow(IllegalAccessError::new);
        System.out.println(findUser.toString());
        findUser.setAge(user.getAge());

        return userRepository.save(user);
    }

    public void deleteUserById(String id) {
        userRepository.deleteById(id);
    }

}
