package com.example.demo.Web;

import com.example.demo.dtos.UserDto;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService){
        this.userService = userService;
    }


    @PostMapping("/user")
    public UserDto createUser(@RequestBody UserDto userDto){
        UserDto createUser = userService.createUser(userDto);
        return createUser;
    }

    @GetMapping("/user/{id}")
    public UserDto getUserById(@PathVariable UUID id){
        UserDto userById = userService.getUserById(id);
        return userById;
    }

    @GetMapping("/user")
    public List<UserDto> getAllUsers(){
        List<UserDto> allUsers = userService.getAllUsers();
        return allUsers;
    }

    @PutMapping("/user/{id}")
    public UserDto updateUser(@PathVariable UUID id, @RequestBody UserDto userDto){
        UserDto updateUser = userService.updateUser(id, userDto);
        return updateUser;
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable UUID id){
        userService.deleteUser(id);
    }

}
