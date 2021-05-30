package com.company;


public class Ticket {

    public String pnr;
    public String boarding;
    public String destination;
    public String seatNumber;
    public String departureDateTime; //time in 24hrs
    public String arrivalDateTime;   //time in 24hrd
    public boolean cancelled;
    Flight flight;
    Passenger passenger;


    public  Ticket(String pnr, String boarding, String destination, String departureDateTime, String arrivalDateTime, boolean cancelled){
             this.pnr= pnr;
             this.boarding= boarding;
             this.destination= destination;
             this.departureDateTime= departureDateTime;
             this.arrivalDateTime= arrivalDateTime;
             this.cancelled= cancelled;
    }

    public Ticket(){
        this("null","null","null","null","null",false);
    }

    public  Ticket(Ticket ticket){
        this.pnr= ticket.pnr;
        this.boarding= ticket.boarding;
        this.destination= ticket.destination;
        this.departureDateTime= ticket.departureDateTime;
        this.arrivalDateTime= ticket.arrivalDateTime;
        this.cancelled= ticket.cancelled;
    }

    public  String getStatus(){
        return  pnr+" "+boarding+" "+destination+" "+seatNumber+" "+departureDateTime+" "+arrivalDateTime;
    }

    public int getFlightDuration(){
        return  Integer.parseInt(arrivalDateTime)- Integer.parseInt(departureDateTime);
    }

    public void cancel(){
        System.out.println("Ticket with pnr number: "+ pnr+" has been cancelled");
        flight.capacity++;
        cancelled= true;
    }
}
