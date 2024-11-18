public class User {
    package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private int age;

    // Getters and Setters
}

}
