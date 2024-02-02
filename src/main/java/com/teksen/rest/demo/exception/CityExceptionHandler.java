package com.teksen.rest.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.sql.Date;
import java.sql.Timestamp;

@ControllerAdvice
public class CityExceptionHandler {

    @ExceptionHandler(value = {CityNotFoundException.class})
    public ResponseEntity<Object> handleCityNotFoundException
            (CityNotFoundException cityNotFoundException)
    {

        CityException cityException = new CityException(
                cityNotFoundException.getMessage(),
                cityNotFoundException.getCause(),
                HttpStatus.NOT_FOUND,
                new Timestamp(System.currentTimeMillis())
        );

        return new ResponseEntity<>(cityException, cityException.getHttpStatus());
    }
}
