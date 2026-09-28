package com.hotel_booking.spring_basics.service;

import org.springframework.stereotype.Service;

@Service 
public class WelcomeService {
  public String getWelcomeMessage() {
    return "Welcome to Hotel Booking App";
  }
}
