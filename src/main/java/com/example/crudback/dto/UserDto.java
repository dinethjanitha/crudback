package com.example.crudback.dto;


import lombok.Data;

@Data
public class UserDto {
    private String id;
    private String name;
    private String email;
    private String type;
    private String password;
}
