package com.capstone.domain.user.dto;

import com.capstone.domain.user.domain.User;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class UserDto {

    @Getter
    @RequiredArgsConstructor
    public static class LoginRequest {
        @NotNull(message = "회원번호는 null 일 수 없습니다.")
        private final Long kakaoId;
        @NotBlank(message = "이름은 null 이거나 빈 칸일 수 없습니다.")
        private final String name;
        @NotNull(message = "성별은 null 일 수 없습니다.")
        private final User.Gender gender;
    }
}
