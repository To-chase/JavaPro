package com.day14.day14.异常关卡二;

public class NoLifeValueExption extends RuntimeException {
    public NoLifeValueExption() {

    }

    public NoLifeValueExption(String message) {
        super(message);
    }
}
