package com.company;

import java.lang.*;
import java.util.*;



public class Main {
     // method to achieve polymorphism
    // Upcasting
    public static void printTicketDetails(Ticket ticket){
        System.out.println(ticket.getPnr());
    }

    public static void main(String[] args) {

        // Creating an object of passenger1
    	Passenger passenger1= new Passenger("Krishna Kirana","9663627592","kiiran837@gmail.com","Ps Nagar","Kasaragod","Kerala" );

    	// creating an object of passenger2
    	Passenger passenger2= new Passenger("Prashanth","7560965513","prash837@gmail.com","Bejai","DK","Karnataka" );

    	// Creating an object of Flight1
    	Flight flight1= new Flight("BA112","British Airways", 270);

        // Creating an object of Flight2
    	Flight flight2= new Flight("SP234","SpiceJet", 184);

    	// Creating Regular ticket object with special services
        RegularTicket regularTicket1= new RegularTicket("TA123",passenger1,flight1,"AA89", "Kochi", "London",
                                                       "7", "20", false,"food&drinks");

        // Creating Tourist ticket object with selected tourist locations
        TouristTicket touristTicket1= new TouristTicket("TR789",passenger2,flight2,"CD126", "Mumbai", "Denmark", "9",
                                                       "20", false,"Denmark,Norway,Switzerland ","Scandic Falkoner, Hovedstaden, Denmark");

                printTicketDetails(regularTicket1);
                printTicketDetails(touristTicket1);
                System.out.println();       //New line


                // Displays Passenger details
                System.out.println(passenger1.getContact());
                System.out.println(passenger1.getAddress());
                System.out.println();       //New line


                // Displays Flight details
                System.out.println(flight1.getFlightDetails());
                System.out.println();
                System.out.println(flight2.getFlightDetails());
                System.out.println();      //New Line
                // Displays regular ticket details


                System.out.println(regularTicket1.getStatus());
                System.out.println();     // New line

                // Displays tourist ticket details
                System.out.println(touristTicket1.getStatus());
                touristTicket1.displaySelectedTouristLocations();



    }

}
