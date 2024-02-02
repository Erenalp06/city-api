package com.teksen.rest.demo.exception;

import org.springframework.http.HttpStatus;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class CityException {
    private final String message;
    private final Throwable throwable;
    private final HttpStatus httpStatus;
    private final String formattedTimeStamp;

    public CityException(String message, Throwable throwable, HttpStatus httpStatus, Timestamp timestamp) {
        this.message = message;
        this.throwable = throwable;
        this.httpStatus = httpStatus;
        this.formattedTimeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(timestamp);
    }

    public String getMessage() {
        return message;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public String getFormattedTimeStamp() {
        return formattedTimeStamp;
    }
}
