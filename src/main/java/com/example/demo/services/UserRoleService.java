package com.example.demo.services;

import com.example.demo.dtos.RoleDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserRoleService<ID>  {

    RoleDto createNewRole(RoleDto roleDto);

    List<RoleDto> getAllRoles();

    RoleDto getRoleById(ID id);

    RoleDto updateRole(ID id, RoleDto roleDto);

    void deleteRole(ID id);

}
