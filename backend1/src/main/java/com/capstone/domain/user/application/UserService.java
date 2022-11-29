package com.capstone.domain.user.application;

import com.capstone.domain.user.dto.UserDto.*;

public interface UserService {

    void save(LoginRequest request);
}
