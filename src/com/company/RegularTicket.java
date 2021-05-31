package com.company;

public class RegularTicket extends Ticket {

    private String specialServices;

    public RegularTicket(String pnr,Passenger passenger,Flight flight,String seatNumber, String boarding, String destination,
                             String departureDateTime, String arrivalDateTime, boolean cancelled, String specialServices){

        super(pnr, passenger, flight, seatNumber, boarding, destination, departureDateTime, arrivalDateTime, cancelled);
        this.specialServices= specialServices;
    }

    public String getSpecialServices() {
        return specialServices;
    }

    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }

    public  void updateSpecialServices(String specialServices){
        this.specialServices= specialServices;
    }
}
