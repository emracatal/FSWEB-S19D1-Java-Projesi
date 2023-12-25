package com.wit.S19D1.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class CinemaErrorResponse {
    private int status;
    private String message;
    private LocalDateTime dateTime;
}
