package com.example.pom2.advisor;

import com.example.pom2.exception.NotFoundException;
import com.example.pom2.utill.StandardResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//we use this package to handle the our custom exception
@RestControllerAdvice
public class CustomExceptionHandler {
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<StandardResponse> handleNotFoundException(NotFoundException e) {
        return new ResponseEntity<>(
                new StandardResponse("error occur",404,e.getMessage()), HttpStatus.NOT_FOUND
        );
    }
}
