package com.devdoul.com.blog.entity;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String hashedPassword;
    private Date registredAt;
    private Date lastLogin;
    private String Intro;

}
