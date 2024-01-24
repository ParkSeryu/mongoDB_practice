package com.example.mongodb_practice.repository;

import com.example.mongodb_practice.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataMongoTest
class UserRepositoryTest {
    // given - when - then

    @Autowired
    private UserRepository userRepository;

    @Test
    public void save() {
        User user = new User();
        user.setName("test1");
        user.setAge(10);
        userRepository.save(user);

        User findUser = userRepository.findById(user.getId()).orElseThrow(IllegalAccessError::new);

        assertThat(findUser).isNotNull();
        assertThat(findUser.getName()).isEqualTo(user.getName());
        assertThat(findUser.getAge()).isEqualTo(user.getAge());
    }

}