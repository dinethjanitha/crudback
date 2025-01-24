package com.example.crudback.repo;


import com.example.crudback.dto.UserDto;
import com.example.crudback.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE  = Mappers.getMapper(UserMapper.class);

    UserDto userToDto(User user);
    User userDtoToUser(UserDto userDto);

}
