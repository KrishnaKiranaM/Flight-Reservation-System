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


    public  Ticket(String pnr,Passenger passenger,Flight flight,String seatNumber, String boarding,
                   String destination, String departureDateTime, String arrivalDateTime, boolean cancelled){

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
        // Copy Constructor
        //Constructor overloading
            this(ticket.pnr ,ticket.passenger,ticket.flight,ticket.seatNumber,ticket.boarding,
                    ticket.destination,ticket.departureDateTime,ticket.arrivalDateTime,ticket.cancelled);

    }

    public  Ticket(){}

    // getters and setters for handling private date and scalability
    //method returns pnr of the ticket
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

    public Flight getFlight() {
        return flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    // method return Ticket details
    public  String getStatus(){
        if(this.cancelled){
            return "Ticket Cancelled";
        }
        else {
            return  "PNR: "+this.pnr+", Boarding: "+this.boarding+", Destination: "+this.destination+", Seat Number: "
                    +this.seatNumber+", Departure Time:"+this.departureDateTime+"hrs,  Arrival Time:"+this.arrivalDateTime+"hrs, Status: Booked, ";
        }
    }

    // returns flight duration
    public int getFlightDuration(){
        return  Integer.parseInt(this.arrivalDateTime)- Integer.parseInt(this.departureDateTime);
    }

    // method cancels the ticket
    public void cancel(){
        System.out.println("Ticket with pnr number: "+ pnr+" has been cancelled");
       this.flight.decrementBookingCounter();
        this.cancelled= true;
    }
}
