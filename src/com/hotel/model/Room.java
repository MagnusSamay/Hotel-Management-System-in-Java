package com.hotel.model;

import java.io.Serializable;

public class Room implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String roomNumber;
    private RoomType type;
    private double price;
    private boolean available;
    private int capacity;
    
    public enum RoomType {
        SINGLE, DOUBLE, SUITE, DELUXE
    }
    
    public Room(String roomNumber, RoomType type, double price, int capacity) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.price = price;
        this.capacity = capacity;
        this.available = true;
    }
    
  
    public String getRoomNumber() { return roomNumber; }
    public RoomType getType() { return type; }
    public double getPrice() { return price; }
    public boolean isAvailable() { return available; }
    public int getCapacity() { return capacity; }
    
    public void setAvailable(boolean available) { this.available = available; }
    public void setPrice(double price) { this.price = price; }
    
    @Override
    public String toString() {
        return String.format("Room %s: %s, $%.2f/night, Capacity: %d, %s", 
            roomNumber, type, price, capacity, available ? "Available" : "Occupied");
    }
}