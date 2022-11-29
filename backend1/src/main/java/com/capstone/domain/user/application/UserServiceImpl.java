package com.capstone.domain.user.application;

import com.capstone.domain.user.dao.UserRepository;
import com.capstone.domain.user.domain.User;
import com.capstone.domain.user.dto.UserDto.*;
import com.capstone.domain.user.dto.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@RequiredArgsConstructor
@Transactional
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    @Transactional(readOnly = true)
    public void save(LoginRequest request) {
        Optional<User> user = userRepository.findByKakaoId(request.getKakaoId());
        if (user.isEmpty()) {
            userRepository.save(userMapper.toEntity(request));
        }
    }
}
