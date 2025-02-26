package com.example.pro01.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum SuccessEnum {
    LOGIN_SUCCESS(HttpStatus.OK, "로그인 성공"),
    USER_CREATED(HttpStatus.CREATED, "사용자가 성공적으로 생성되었습니다.");

    private final HttpStatus httpStatus;
    private final String message;
}
