package com.company;


public abstract class Ticket {

    private String pnr;
    private String boarding;
    private String destination;
    private String seatNumber;
    private String departureDateTime; //time in 24hrs
    private String arrivalDateTime;   //time in 24hrd
    private boolean cancelled;
    private Flight flight;
    private Passenger passenger;


    public  Ticket(String pnr,Passenger passenger,Flight flight,String seatNumber, String boarding, String destination, String departureDateTime, String arrivalDateTime, boolean cancelled){
             this.pnr= pnr;
             this.passenger = passenger;
             this.flight= flight;
             this.seatNumber=seatNumber;
             this.boarding= boarding;
             this.destination= destination;
             this.departureDateTime= departureDateTime;
             this.arrivalDateTime= arrivalDateTime;
             this.cancelled= cancelled;
    }


    public  Ticket(Ticket ticket){
        this.pnr= ticket.pnr;
        this.passenger= ticket.passenger;
        this.flight= ticket.flight;
        this.seatNumber= ticket.seatNumber;;
        this.boarding= ticket.boarding;
        this.destination= ticket.destination;
        this.departureDateTime= ticket.departureDateTime;
        this.arrivalDateTime= ticket.arrivalDateTime;
        this.cancelled= ticket.cancelled;
    }

    public  Ticket(){}

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getBoarding() {
        return boarding;
    }

    public void setBoarding(String boarding) {
        this.boarding = boarding;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public  String getStatus(){
        return  pnr+" "+boarding+" "+destination+" "+seatNumber+" "+departureDateTime+" "+arrivalDateTime;
    }

    public int getFlightDuration(){
        return  Integer.parseInt(arrivalDateTime)- Integer.parseInt(departureDateTime);
    }

    public void cancel(){
        System.out.println("Ticket with pnr number: "+ pnr+" has been cancelled");
       this.flight.decrementBookingCounter();
        cancelled= true;
    }
}
