package com.example.demo.services;

import com.example.demo.dtos.UserDto;

import java.util.List;

public interface UserService<ID> {
    UserDto createUser(UserDto userDto);

    List<UserDto> getAllUsers();

    UserDto getUserById(ID id);

    UserDto updateUser(ID id, UserDto userDto);

    void deleteUser(ID id);
}
