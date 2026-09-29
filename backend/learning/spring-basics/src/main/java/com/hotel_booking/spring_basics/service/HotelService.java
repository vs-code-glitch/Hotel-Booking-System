package com.hotel_booking.spring_basics.service;

import com.hotel_booking.spring_basics.exception.HotelNotFoundException;
import com.hotel_booking.spring_basics.model.Hotel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service 
public class HotelService {

  private final List<Hotel> hotels = new ArrayList<>();

  public List<Hotel> getAllHotels()
  {
    return hotels;
  }
  
  public Hotel createHotel(Hotel hotel) {
    hotel.setId((long) (hotels.size() + 1));
    hotels.add(hotel);

    return hotel;
  }

  public Hotel getHotelById(Long id) {

    return hotels.stream()
            .filter(hotel -> hotel.getId().equals(id))
            .findFirst()
            .orElseThrow(() ->
                    new HotelNotFoundException(
                            "Hotel not found with id: " + id
                    )
            );
}
}
