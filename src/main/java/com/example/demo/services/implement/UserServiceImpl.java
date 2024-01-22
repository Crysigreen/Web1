package com.example.demo.services.implement;

import com.example.demo.dtos.UserDto;
import com.example.demo.model.Enums;
import com.example.demo.model.User;
import com.example.demo.repositories.UserRepository;
import com.example.demo.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
//@EnableCaching
public class UserServiceImpl implements UserService<UUID> {

    private UserRepository userRepository;
    private ModelMapper modelMapper;
    @Autowired
    public void setModelMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDto createUser(UserDto userDto) {
        User user = modelMapper.map(userDto, User.class);
        return modelMapper.map(userRepository.save(user), UserDto.class);
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream()
                .map(user -> modelMapper.map(user, UserDto.class))
                .collect(java.util.stream.Collectors.toList());
    }

    @Override
    public UserDto getUserById(UUID id) {
        return modelMapper.map(userRepository.findById(id).get(), UserDto.class);
    }

    @Override
    public UserDto updateUser(UUID id, UserDto userDto) {
        User user = userRepository.findById(id).get();
        modelMapper.map(userDto, user);
        return modelMapper.map(userRepository.save(user), UserDto.class);
    }

    @Override
    public void deleteUser(UUID id) {
        userRepository.deleteById(id);
    }
}