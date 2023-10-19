package com.example.demo.services.implement;

import com.example.demo.dtos.RoleDto;
import com.example.demo.model.Enums;
import com.example.demo.model.UserRole;
import com.example.demo.repositories.UserRoleRepository;
import com.example.demo.services.UserRoleService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserRoleServiceImpl implements UserRoleService<UUID>{

    @Autowired
    private ModelMapper modelMapper;
    @Autowired private UserRoleRepository userRoleRepository;

    @Override
    public RoleDto createNewRole(RoleDto userRoleDto) {
        UserRole userRole = modelMapper.map(userRoleDto, UserRole.class);
        return modelMapper.map(userRoleRepository.save(userRole), RoleDto.class);
    }

    @Override
    public List<RoleDto> getAllRoles() {
        List<UserRole> userRoles = userRoleRepository.findAll();
        return userRoles.stream()
                .map(userRole -> modelMapper.map(userRole, RoleDto.class))
                .collect(java.util.stream.Collectors.toList());
    }

    @Override
    public RoleDto getRoleById(UUID id) {
        return modelMapper.map(userRoleRepository.findById(id).get(), RoleDto.class);
    }

    @Override
    public RoleDto updateRole(UUID id, RoleDto userRoleDto) {
        UserRole userRole = userRoleRepository.findById(id).get();
        modelMapper.map(userRoleDto, userRole);
        return modelMapper.map(userRoleRepository.save(userRole), RoleDto.class);
    }

    @Override
    public void deleteRole(UUID id) {
        userRoleRepository.deleteById(id);
    }



}
