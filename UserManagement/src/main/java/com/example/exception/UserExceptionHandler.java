package com.example.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
 
@ControllerAdvice
public class UserExceptionHandler extends ResponseEntityExceptionHandler{


    @ExceptionHandler(UserNotFoundException.class)
    public final ResponseEntity<Object> handleUserNotFoundExceptions(UserNotFoundException ex,
            WebRequest request)  
    {
 
        ExceptionResponse exceptionResponse  = new ExceptionResponse(new Date(),ex.getMessage() ,request.getDescription(false) );
        return new ResponseEntity<Object>(exceptionResponse,HttpStatus.NOT_FOUND);
    }


 
}