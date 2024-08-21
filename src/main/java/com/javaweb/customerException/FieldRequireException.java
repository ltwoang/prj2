package com.javaweb.customerException;

public class FieldRequireException extends RuntimeException {
  public FieldRequireException() {
    super("Field Require is null");
  }
  
  public FieldRequireException(String exceptionMessage) {
    super(exceptionMessage);
  }
}