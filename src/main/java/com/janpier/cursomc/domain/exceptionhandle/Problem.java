package com.janpier.cursomc.domain.exceptionhandle;

import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Problem {
  
  private Integer status;
  private String message;
  private OffsetDateTime dateTime;
  
  public Problem() {}
  
  public Problem(Integer status, String message, OffsetDateTime dateTime) {
    super();
    this.status = status;
    this.message = message;
    this.dateTime = dateTime;
  }
  
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }
  public OffsetDateTime getDateTime() {
    return dateTime;
  }
  public void setDateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
  }
  
  

}
