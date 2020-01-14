package com.day14.day14.异常关卡一;

public class NoScoreException extends RuntimeException {
    public NoScoreException() {
    }

    public NoScoreException(String message) {
        super(message);
    }
}
