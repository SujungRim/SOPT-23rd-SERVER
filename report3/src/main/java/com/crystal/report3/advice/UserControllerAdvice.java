package com.crystal.report3.advice;

import com.crystal.report3.exception.NotFoundUserException;
import com.crystal.report3.model.DefaultRes;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UserControllerAdvice {

    @ExceptionHandler(NotFoundUserException.class)
    public DefaultRes notFoundUserException(NotFoundUserException exception){
        return DefaultRes.res(HttpStatus.NOT_FOUND.value(), exception.getMessage());
    }
}
