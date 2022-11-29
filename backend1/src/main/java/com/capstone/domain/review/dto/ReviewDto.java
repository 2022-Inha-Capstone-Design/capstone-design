package com.capstone.domain.review.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class ReviewDto {

    @Getter
    @RequiredArgsConstructor
    public static class ReviewRequest {
        @NotNull(message = "점수는 null 일 수 없습니다.")
        @Max(value = 5, message = "별점은 5점보다 클 수 없습니다.")
        @Min(value = 0, message = "별점은 0점보다 작을 수 없습니다.")
        private final Integer stars;
        @NotNull(message = "회원번호는 null 일 수 없습니다.")
        private final Long userId;
        @NotNull(message = "메뉴번호는 null 일 수 없습니다.")
        private final Long menuId;
    }

    @Getter
    @RequiredArgsConstructor
    public static class ReviewResponse {
        private final Integer stars;
    }
}
