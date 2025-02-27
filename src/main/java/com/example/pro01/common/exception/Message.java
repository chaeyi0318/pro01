package com.example.pro01.common.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Getter
@Builder
@AllArgsConstructor
public class Message<T> {

    private boolean status;
    private String message;
    private T data;

    public static ResponseEntity<Message> toExceptionResponseEntity(ExceptionEnum exceptionMessage) {
        return ResponseEntity
                .status(exceptionMessage.getHttpStatus())
                .body(Message.builder()
                        .status(!exceptionMessage.getHttpStatus().isError())
                        .message(exceptionMessage.getMessage())
                        .data(exceptionMessage)
                        .build()
                );
    }

    public static ResponseEntity<Message> toAllExceptionResponseEntity(HttpStatus httpStatus,String message, Object data) {
        return ResponseEntity
                .status(httpStatus)
                .body(Message.builder()
                        .status(false)
                        .message(message)
                        .data(data)
                        .build()
                );
    }

    public static ResponseEntity<Message> toResponseEntity(SuccessEnum successMessage) {
        return ResponseEntity
                .status(successMessage.getHttpStatus())
                .body(Message.builder()
                        .status(!successMessage.getHttpStatus().isError())
                        .message(successMessage.getMessage())
                        .data(successMessage)
                        .build()
                );
    }

    //리턴 값 있을때 사용
    public static ResponseEntity<Message> toResponseEntity(SuccessEnum successMessage, Object data) {
        return ResponseEntity
                .status(successMessage.getHttpStatus())
                .body(Message.builder()
                        .status(!successMessage.getHttpStatus().isError())
                        .message(successMessage.getMessage())
                        .data(data)
                        .build()
                );
    }
}