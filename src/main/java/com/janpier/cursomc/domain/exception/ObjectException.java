package com.janpier.cursomc.domain.exception;

public class ObjectException extends RuntimeException {
  private static final long serialVersionUID = 1L;
  
  public ObjectException (String message) {
    super(message);
  }
}
