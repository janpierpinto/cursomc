package com.janpier.cursomc.domain.exceptionhandle;

import java.time.OffsetDateTime;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.janpier.cursomc.domain.exception.ObjectException;

@ControllerAdvice
public class SystemHandleException extends ResponseEntityExceptionHandler {
  
  @ExceptionHandler(ObjectException.class)
  public ResponseEntity<Object> handleObjectException (ObjectException ex, WebRequest request) {
    
    HttpStatus status =  HttpStatus.BAD_REQUEST;
    
    Problem problem = new Problem(status.value(), ex.getMessage(), OffsetDateTime.now());
    return super.handleExceptionInternal(ex, problem, new HttpHeaders(), status, request);
  }

}
