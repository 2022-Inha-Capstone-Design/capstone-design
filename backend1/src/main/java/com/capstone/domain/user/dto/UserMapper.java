package com.capstone.domain.user.dto;

import com.capstone.domain.user.domain.User;
import com.capstone.domain.user.dto.UserDto.*;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(LoginRequest request);
}
