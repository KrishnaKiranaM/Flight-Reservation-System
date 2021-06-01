package com.company;

public class RegularTicket extends Ticket {

    private String specialServices;

    public RegularTicket(String pnr,Passenger passenger,Flight flight,String seatNumber, String boarding, String destination,
                             String departureDateTime, String arrivalDateTime, boolean cancelled, String specialServices){
         // constructor overloading using super keyword
         // calling parent constructor
        super(pnr, passenger, flight, seatNumber, boarding, destination, departureDateTime, arrivalDateTime, cancelled);
        this.specialServices= specialServices;
    }


    // getters and setters for handling private date and scalability
    // method sets Special services
    // method return Special Services opted by the Passenger
    public String getSpecialServices() {
        return specialServices;
    }


    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }

    // method updates special service
    public  void updateSpecialServices(String specialServices){
        this.specialServices= specialServices;
    }

    public  String getStatus(){
        if(super.isCancelled()){
            return "Ticket Cancelled";
        }
        else {
            return super.getStatus() + " Special Services: " + this.specialServices;
        }
    }
}
