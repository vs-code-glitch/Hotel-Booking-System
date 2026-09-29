package com.hotel_booking.spring_basics.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class HotelRequest {
  @NotBlank(message = "Hotel name is required")
  private String name;
  
  @NotBlank(message = "City is required")
  private String city;

  @NotNull(message = "Price is required")
  @Min(value = 1, message = "Price must be greater than 0")
  private double pricePerNight;

  public HotelRequest() {

  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

}
