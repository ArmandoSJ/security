package com.technologyos.auth.exceptions;

public class InvalidPasswordException extends RuntimeException {
   public InvalidPasswordException(){}

   public InvalidPasswordException(String message){
      super(message);
   }

   public InvalidPasswordException(String message, Throwable cause){
      super(message, cause);
   }
}
