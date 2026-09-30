package com.hotel_booking.spring_basics.controller;

import jakarta.validation.Valid;


import com.hotel_booking.spring_basics.dto.HotelRequest;
import com.hotel_booking.spring_basics.model.Hotel;
import com.hotel_booking.spring_basics.service.HotelService;


import org.springframework.web.bind.annotation.*;


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
  public Hotel createHotel(@Valid @RequestBody HotelRequest hotel) {
    return hotelService.createHotel(hotel);
  }

  @DeleteMapping("/{id}")
  public String deleteHotel(@PathVariable Long id) {

    hotelService.deleteHotel(id);

    return "Hotel deleted successfully";

  }
  
  @PutMapping("/{id}")
public Hotel updateHotel(
        @PathVariable Long id,
    @Valid @RequestBody HotelRequest request) {

  return hotelService.updateHotel(id, request);

}
  
} 