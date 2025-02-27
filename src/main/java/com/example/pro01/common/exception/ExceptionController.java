package com.example.pro01.common.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class ExceptionController {
    @ExceptionHandler(value = { CustomException.class })
    protected ResponseEntity<Message> handleCustomException(CustomException e) {
        log.error("handleCustomException throw CustomException : {}", e.getExceptionEnum());
        return Message.toExceptionResponseEntity(e.getExceptionEnum());
    }

    //정규식
    @ExceptionHandler({BindException.class})
    public ResponseEntity<Message> bindException(BindException ex) {
        return Message.toAllExceptionResponseEntity(HttpStatus.BAD_REQUEST, ex.getFieldError().getDefaultMessage(), ex.getBindingResult().getTarget());
    }

// @ExceptionHandler({MissingRequestHeaderException.class})
// public ResponseEntity<Message> missingRequestHeaderException(MissingRequestHeaderException ex) {
// return Message.toAllExceptionResponseEntity(HttpStatus.UNAUTHORIZED, UNAUTHORIZED_MEMBER.getDetail(), null);
// }

// @ExceptionHandler({SignatureException.class})
// public ResponseEntity<Message> signatureException(SignatureException ex) {
// return Message.toAllExceptionResponseEntity(HttpStatus.UNAUTHORIZED, INVALID_TOKEN.getDetail(), null);
// }

    // 500
    @ExceptionHandler({Exception.class})
    public ResponseEntity<Message> handleAll(final Exception ex) {
        return Message.toAllExceptionResponseEntity(HttpStatus.BAD_REQUEST, ex.getMessage(), ex.toString());
    }
}
