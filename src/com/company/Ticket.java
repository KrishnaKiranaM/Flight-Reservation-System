package com.company;


public class Ticket {

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

    public  String getStatus(){
        return  pnr+" "+boarding+" "+destination+" "+seatNumber+" "+departureDateTime+" "+arrivalDateTime;
    }

    public int getFlightDuration(){
        return  Integer.parseInt(arrivalDateTime)- Integer.parseInt(departureDateTime);
    }

    public void cancel(){
        System.out.println("Ticket with pnr number: "+ pnr+" has been cancelled");
       // flight.capacity++;
        cancelled= true;
    }
}
