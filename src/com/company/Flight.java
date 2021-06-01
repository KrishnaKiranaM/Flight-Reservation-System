package com.company;

public class Flight {
    private   String flightNumber;
    private   String airline;
    private   int bookedSeats;
    private   int capacity;

     //
    public Flight(String flightNumber, String airline, int capacity){
        this.flightNumber= flightNumber;
        this.airline= airline;
        this.capacity= capacity;
    }
    public Flight(){}

    public Flight(Flight flight){
        // constructor overloading
        //copy constructor
        this(flight.flightNumber,flight.airline,flight.capacity);

    }

    // getters and setters for handling private date and scalability
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    // method return number of seats booked
    public int getBookedSeats() {
        return bookedSeats;
    }

     // method return the seat capacity of airplane
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    // method return flight details
    public  String getFlightDetails(){
        return getFlightNumber()+" "+getAirline()+" "+getCapacity()+" "+getBookedSeats();
    }

    // method checks whether seats available or not
    public boolean checkAvailability(){
        if(capacity>bookedSeats){
            return  true;
        }
        else{
            return  false;
        }
    }

    // Counter incremented on booking tickets
    public void incrementBookingCounter(){
        bookedSeats++;
    }

    // counter decrement on cancellation of ticket
    public  void decrementBookingCounter(){
        bookedSeats--;
    }
}
