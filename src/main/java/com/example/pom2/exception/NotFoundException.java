package com.example.pom2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException{        //in here we extends our custom notfoundexception class from java runtimeexception class
        public NotFoundException(String message){
            super(message);
        }
}
