package com.hotel_booking.spring_basics.service;

import com.hotel_booking.spring_basics.dto.HotelRequest;
import com.hotel_booking.spring_basics.exception.HotelNotFoundException;
import com.hotel_booking.spring_basics.model.Hotel;
import com.hotel_booking.spring_basics.repository.HotelRepository;

import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class HotelService {

  private final HotelRepository hotelRepository;

  public HotelService(HotelRepository hotelRepository) {
    this.hotelRepository = hotelRepository;
  }

  public List<Hotel> getAllHotels() {
    return hotelRepository.findAll();
  }

  public Hotel createHotel(HotelRequest request) {
    Hotel hotel = new Hotel();

    hotel.setName(request.getName());
    hotel.setCity(request.getCity());
    hotel.setPricePerNight(request.getPricePerNight());

    return hotelRepository.save(hotel);
  }

  //   public Hotel getHotelById(Long id) {

  //     return hotels.stream()
  //             .filter(hotel -> hotel.getId().equals(id))
  //             .findFirst()
  //             .orElseThrow(() ->
  //                     new HotelNotFoundException(
  //                             "Hotel not found with id: " + id
  //                     )
  //             );
  // }
  public Hotel getHotelById(Long id) {
    return hotelRepository.findById(id)
        .orElseThrow(() -> new HotelNotFoundException("Hotel not found with id: " + id));
  }
  
  public void deleteHotel(Long id) {

    if (!hotelRepository.existsById(id)) {
      throw new HotelNotFoundException(
          "Hotel not found with id: " + id);
    }

    hotelRepository.deleteById(id);

  }
  
   public Hotel updateHotel(
        Long id,
       HotelRequest request) {

     Hotel hotel = hotelRepository.findById(id)
         .orElseThrow(() -> new HotelNotFoundException(
             "Hotel not found with id: " + id));

     hotel.setName(request.getName());
     hotel.setCity(request.getCity());
     hotel.setPricePerNight(request.getPricePerNight());

     return hotelRepository.save(hotel);

   }
  
   
}
