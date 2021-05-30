package com.company;

public class Flight {
    public  String flightNumber;
    public  String airline;
    private int bookedSeats;
    public  int capacity;
    public  int counter;

    public Flight(String flightNumber, String airline, int capacity){
        this.flightNumber= flightNumber;
        this.airline= airline;
        this.capacity= capacity;
    }
    public Flight(){
        this("null","null",0);
    }

    public Flight(Flight flight){
        this.flightNumber= flight.flightNumber;
        this.airline= flight.airline;
        this.capacity= flight.capacity;
    }

    public  String getFlightDetails(){
        return flightNumber+" "+airline+" "+capacity+" "+bookedSeats;
    }

    public boolean checkAvailability(){
        if(capacity>bookedSeats){
            return  true;
        }
        else{
            return  false;
        }
    }

    public void incrementBookingCounter(){
        counter++;
    }
}
