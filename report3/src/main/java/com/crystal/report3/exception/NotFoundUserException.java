package com.crystal.report3.exception;

public class NotFoundUserException extends RuntimeException {
    public NotFoundUserException() {
        super("회원이 없습니다.");
    }
}
