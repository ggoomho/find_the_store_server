package com.cholssoft.findthestore.exception;

import lombok.Getter;

@Getter
public class FTSException extends RuntimeException {
    private ErrorCode errorCode;
    
    public FTSException(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }
}