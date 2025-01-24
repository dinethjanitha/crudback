package com.example.crudback.service;

import com.example.crudback.dto.UserDto;
import com.example.crudback.model.User;
import com.example.crudback.repo.UserMapper;
import com.example.crudback.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    public UserRepo userRepo;

    private final UserMapper userMapper = UserMapper.INSTANCE;

    public List<UserDto> getAllUsers(){
       return userRepo.findAll().stream().map(userMapper::userToDto).collect(Collectors.toList());
    }


    public  UserDto saveUser(UserDto userDto){
        User user = userMapper.userDtoToUser(userDto);
        return userMapper.userToDto(userRepo.save(user));
    }

    public UserDto updateUser(UserDto userDto){
        User user = userMapper.userDtoToUser(userDto);
        return userMapper.userToDto(userRepo.save(user));
    }

    public String deleteUser(UserDto userDto) {

        Optional<User> userOptional = userRepo.findById(userDto.getId());

        if (userOptional.isEmpty()) {
            return "User Not Found!";
        }

        userRepo.deleteById(userDto.getId());

        boolean exists = userRepo.existsById(userDto.getId());

        if (exists) {
            return "Deletion failed";
        } else {
            return "Deletion successful";
        }
    }



}
