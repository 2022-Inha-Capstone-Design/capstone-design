package com.capstone.domain.user.api;

import com.capstone.domain.user.application.UserService;
import com.capstone.domain.user.dto.UserDto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static org.springframework.http.HttpStatus.CREATED;

@RequiredArgsConstructor
@RequestMapping("/users")
@RestController
public class UserController {

    private final UserService userService;

    @PostMapping("/save")
    public ResponseEntity<String> save(@Valid @RequestBody LoginRequest request) {
        userService.save(request);
        return ResponseEntity.status(CREATED).body("성공적으로 로그인되었습니다.");
    }
}
