package com.crystal.report2.exception;

public class NotFoundUserException extends RuntimeException {
    public NotFoundUserException() {
        super("없습니다.");
    }
}
