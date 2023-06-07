package com.example.registrationformclient.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.ResourceAccessException;

@RestControllerAdvice
@Slf4j
public class IntercepterExeptionHandler {

    @ExceptionHandler(ResourceAccessException.class)
    public ResponseEntity<?> handlerResourceAccessExeption (ResourceAccessException e){
        return ResponseEntity.badRequest().body(e);
    }
}
