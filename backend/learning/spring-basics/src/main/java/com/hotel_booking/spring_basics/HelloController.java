package com.hotel_booking.spring_basics;

import com.hotel_booking.spring_basics.service.WelcomeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  private final WelcomeService welcomeService;

  public HelloController(WelcomeService welcomeService) {
    this.welcomeService = welcomeService;
  }

  @GetMapping("/welcome")
  public String welcome() {
    return welcomeService.getWelcomeMessage();
  }

  @GetMapping("/about")
  public String about() {
    return "About";
  }
  
  @GetMapping("/status")
  public String status() {
    return "StaySphere backend is running";
  }
  
}


