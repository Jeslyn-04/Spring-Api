package com.example.demo.mapper;

import com.example.demo.entity.entity;
import com.example.dto.dto;

public class mapper {

    public static dto mapToUserDto(entity user){
        return new dto(
                user.getId(),
                user.getName(),
                user.getPassword(),
                user.getEmail()
        );
    }

    public static entity mapToUser(dto userDto){
        return new entity(
                userDto.getId(),
                userDto.getName(),
                userDto.getPassword(),
                userDto.getEmail()
        );
    }
}