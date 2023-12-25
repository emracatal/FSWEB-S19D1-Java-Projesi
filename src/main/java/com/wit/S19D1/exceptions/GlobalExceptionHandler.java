package com.wit.S19D1.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<CinemaErrorResponse> handleException(CinemaException cinemaException) {
        CinemaErrorResponse cinemaErrorResponse = new CinemaErrorResponse(
                cinemaException.getHttpStatus().value(), cinemaException.getMessage(), LocalDateTime.now()
        );
        return new ResponseEntity<>(cinemaErrorResponse, cinemaException.getHttpStatus());
    }


    @ExceptionHandler
    public ResponseEntity<CinemaErrorResponse> handleException(Exception exception) {
        CinemaErrorResponse cinemaErrorResponse = new CinemaErrorResponse(
                HttpStatus.BAD_REQUEST.value(), exception.getMessage(), LocalDateTime.now()
        );
        log.error("EXCEPTION OCCURED: " + exception.getMessage());
        return new ResponseEntity<>(cinemaErrorResponse, HttpStatus.BAD_REQUEST);
    }
}