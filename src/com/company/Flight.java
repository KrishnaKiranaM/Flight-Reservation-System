package com.company;

public class Flight {
    private   String flightNumber;
    private   String airline;
    private   int bookedSeats;
    private   int capacity;

    public Flight(String flightNumber, String airline, int capacity){
        this.flightNumber= flightNumber;
        this.airline= airline;
        this.capacity= capacity;
    }
    public Flight(){}

    public Flight(Flight flight){
        this.flightNumber= flight.flightNumber;
        this.airline= flight.airline;
        this.capacity= flight.capacity;
    }

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

    public int getBookedSeats() {
        return bookedSeats;
    }


    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public  String getFlightDetails(){
        return getFlightNumber()+" "+getAirline()+" "+getCapacity()+" "+getBookedSeats();
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
        bookedSeats++;
    }
    public  void decrementBookingCounter(){
        bookedSeats--;
    }
}
