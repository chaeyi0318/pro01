package com.example.pro01.common.exception;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Getter
@Builder
@NoArgsConstructor
public class Message<T> {

    private boolean status;
    private String message;
    private T data;

    public Message(boolean status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public static ResponseEntity<Message> toExceptionResponseEntity(ExceptionEnum exceptionEnum) {
        return ResponseEntity
                .status(exceptionEnum.getHttpStatus())
                .body(Message.builder()
                        .message(exceptionEnum.getMessage())
                        .data(exceptionEnum)
                        .build()
                );
    }

    public static ResponseEntity<Message> toAllExceptionResponseEntity(HttpStatus httpStatus, String message, Object data) {
        return ResponseEntity
                .status(httpStatus)
                .body(Message.builder()
                        .status(false)
                        .message(message)
                        .data(data)
                        .build()
                );
    }

    public static ResponseEntity<Message> toResponseEntity(SuccessEnum successEnum) {
        return ResponseEntity
                .status(successEnum.getHttpStatus())
                .body(Message.builder()
                        .status(!successEnum.getHttpStatus().isError())
                        .message(successEnum.getMessage())
                        .data(successEnum)
                        .build()
                );
    }

    //리턴 값 있을때 사용
    public static ResponseEntity<Message> toResponseEntity(SuccessEnum successEnum, Object data) {
        return ResponseEntity
                .status(successEnum.getHttpStatus())
                .body(Message.builder()
                        .status(!successEnum.getHttpStatus().isError())
                        .message(successEnum.getMessage())
                        .data(data)
                        .build()
                );
    }
}