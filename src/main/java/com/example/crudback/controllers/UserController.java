package com.example.crudback.controllers;

import com.example.crudback.dto.UserDto;
import com.example.crudback.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    public UserService userService;

    @PostMapping("/")
    public UserDto saveUser(@RequestBody UserDto userDto){
        return userService.saveUser(userDto);
    }

    @GetMapping("/")
    public List<UserDto> getAllUsers(){
        return  userService.getAllUsers();
    }

    @PutMapping("/")
    public UserDto updateUser(@RequestBody UserDto userDto) {
        return userService.updateUser(userDto);
    }

    @DeleteMapping("/")
    public String deleteUser(@RequestBody UserDto userDto){
        return userService.deleteUser(userDto);
    }
}
