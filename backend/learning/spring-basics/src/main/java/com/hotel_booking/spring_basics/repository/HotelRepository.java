package com.hotel_booking.spring_basics.repository;

import com.hotel_booking.spring_basics.model.Hotel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository 
   extends JpaRepository<Hotel, Long>{

   }

