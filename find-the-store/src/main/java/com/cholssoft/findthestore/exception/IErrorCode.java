package com.cholssoft.findthestore.exception;

import org.springframework.http.HttpStatus;

public interface IErrorCode {
    String getMessage();
    String getErrorCode();
    HttpStatus getHttpStatus();
}

