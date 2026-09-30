package com.hotel_booking.spring_basics.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
   @ExceptionHandler(HotelNotFoundException.class)
   @ResponseStatus(HttpStatus.NOT_FOUND)
   public Map<String,String> handleHotelNotFound(
      HotelNotFoundException exception){
        return Map.of("error",exception.getMessage());
      }
   
}
