package com.hotel_booking.spring_basics.model;


import jakarta.persistence.*;

@Entity
@Table(name = "hotels")
public class Hotel {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  private String city;

  private double pricePerNight;

  public Hotel() {

  }
  
  public Hotel(Long id, String name, String city, Double pricePerNight) {
    this.id = id;
    this.name = name;
    this.city = city;
    this.pricePerNight = pricePerNight;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
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