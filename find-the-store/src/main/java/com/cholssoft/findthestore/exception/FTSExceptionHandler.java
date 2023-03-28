package com.cholssoft.findthestore.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class FTSExceptionHandler {
    @ResponseBody
    @ExceptionHandler(FTSException.class)
    public ResponseEntity<ErrorResponse> ExceptionHandler(FTSException ex) {
        ErrorResponse response = ErrorResponse.of(ex.getErrorCode());
        return ResponseEntity.status(ex.getErrorCode().getHttpStatus()).body(response);
    }
}

