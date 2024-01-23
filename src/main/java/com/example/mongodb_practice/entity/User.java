package com.example.mongodb_practice.entity;


import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
@Getter
public class User {

    @Id
    private String id;
    private String name;
    private int age;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 생성자, getter, setter 등 필요한 메서드 추가

}
