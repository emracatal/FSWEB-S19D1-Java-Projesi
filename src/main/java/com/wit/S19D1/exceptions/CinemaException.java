package com.wit.S19D1.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class CinemaException extends RuntimeException{
    private HttpStatus httpStatus;

    public CinemaException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }
}