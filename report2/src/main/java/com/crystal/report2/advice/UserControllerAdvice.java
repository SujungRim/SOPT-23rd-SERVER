package com.crystal.report2.advice;

import com.crystal.report2.exception.NotFoundUserException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UserControllerAdvice {

    @ExceptionHandler(NotFoundUserException.class)
    public String notFoundUserException(NotFoundUserException exception){
        return exception.getMessage();
    }
}
