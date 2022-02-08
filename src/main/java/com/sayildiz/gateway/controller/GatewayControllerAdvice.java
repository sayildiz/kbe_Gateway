package com.sayildiz.gateway.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.HttpClientErrorException;

@ControllerAdvice
public class GatewayControllerAdvice {
        @ResponseBody
        @ExceptionHandler
        @ResponseStatus(HttpStatus.NOT_FOUND)
        String ConsumedProductNotFoundHandler(HttpClientErrorException.NotFound exception){
            return exception.getMessage();
        }

    @ResponseBody
    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    String ConsumedBadRequestHandler(HttpClientErrorException.BadRequest exception){
        return exception.getMessage();
    }
}

