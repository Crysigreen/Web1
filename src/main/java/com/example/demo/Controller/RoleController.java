package com.example.demo.Controller;

import com.example.demo.dtos.RoleDto;
import com.example.demo.model.Enums;
import com.example.demo.model.UserRole;
import com.example.demo.services.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class RoleController {

    private UserRoleService roleService;

    @Autowired
    public void setRoleService(UserRoleService roleService){
        this.roleService = roleService;
    }

    @PostMapping("/role")
    RoleDto createNewRole(@RequestBody RoleDto roleDto){
        RoleDto createRole = roleService.createNewRole(roleDto);
        return createRole;
    }

    @GetMapping("/role")
    public List<RoleDto> getAllRoles(){
        List<RoleDto> roles = roleService.getAllRoles();
        return roles;
    }

    @GetMapping("/role/{id}")
    RoleDto getRoleById(@PathVariable UUID id){
        RoleDto role = roleService.getRoleById(id);
        return role;
    }

//    @PutMapping("/role/{id}")
//    public void updateRole(){
//
//
//    }

//    @DeleteMapping("/role/{id}")
//    public void deleteRole(){
//
//    }
}
