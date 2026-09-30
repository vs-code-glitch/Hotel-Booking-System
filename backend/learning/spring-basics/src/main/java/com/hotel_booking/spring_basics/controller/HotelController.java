package com.hotel_booking.spring_basics.controller;

import jakarta.validation.Valid;

import com.hotel_booking.spring_basics.model.Hotel;
import com.hotel_booking.spring_basics.service.HotelService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequestMapping("/api/hotels")
public class HotelController {
  
  private final HotelService hotelService;

  public HotelController(HotelService hotelService) {
    this.hotelService = hotelService;
  }
  
  @GetMapping 
  public List<Hotel> getAllHotels() {
    return hotelService.getAllHotels();
  }
  
  @GetMapping("/{id}")
  public Hotel getHotelById(@PathVariable Long id) {
    return hotelService.getHotelById(id);
  }

  @PostMapping
  public Hotel createHotel(@Valid @RequestBody Hotel hotel) {
    return hotelService.createHotel(hotel);
  }
} 