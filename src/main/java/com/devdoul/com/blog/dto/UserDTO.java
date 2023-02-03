package com.devdoul.com.blog.dto;

import lombok.Data;

import java.util.Date;
@Data
public class UserDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Date lastLogin;
    private String Intro;
}
