package com.capstone.global.error.exception;

import lombok.Getter;

@Getter
public enum ExceptionCodeAndDetails {

    // 0000: global
    NOT_FOUND_ERROR_CODE(500, "0001", "발생한 에러의 에러코드를 찾을 수 없습니다."),
    INVALID_INPUT_VALUE(400, "0002", "유효하지 않은 입력입니다."),
    METHOD_NOT_ALLOWED(405, "0003", "허용되지 않은 메소드 접근입니다. 올바른 HTTP Methods 를 입력해주세요."),
    INVALID_JSON_FORMAT(400, "0004", "유효하지 않은 json 형식입니다. 입력을 확인해주세요."),

    // 1000: Ingredient

    // 2000: recipe_ingredient

    // 3000: user_ingredient

    // 4000: menu
    NOT_FOUND_MENU(404, "4001", "해당하는 메뉴를 찾을 수 없습니다."),

    // 5000: review

    // 6000: user
    NOT_FOUND_USER(404, "6001", "해당하는 사용자를 찾을 수 없습니다.")


    ;
    private final int status;
    private final String code;
    private final String message;

    ExceptionCodeAndDetails(int status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }
}
