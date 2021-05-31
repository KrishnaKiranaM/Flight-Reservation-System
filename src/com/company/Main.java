package com.company;

import java.lang.*;
import java.util.*;



public class Main {

    public static void printTicketDetails(Ticket ticket){
        System.out.println(ticket.getPnr());
    }

    public static void main(String[] args) {

    	Passenger passenger1= new Passenger("Krishna Kirana","9663627592","kiiran837@gmail.com","Ps Nagar","Kasaragod","Kerala" );

    	Passenger passenger2= new Passenger("Prashanth","7560965513","prash837@gmail.com","Bejai","DK","Karnataka" );

    	Flight flight1= new Flight("BA112","British Airways", 270);

    	Flight flight2= new Flight("SP234","SpiceJet", 184);

        RegularTicket regularTicket= new RegularTicket("TA123",passenger1,flight1,"AA89", "Kochi", "London",
                                                       "7", "20", false,"food&drinks");

        TouristTicket touristTicket= new TouristTicket("TR789",passenger2,flight2,"CD126", "Mumbai", "Denmark", "7",
                                                       "20", false,"Denmark","Scandic Falkoner, Hovedstaden, Denmark");

                printTicketDetails(regularTicket);
                printTicketDetails(touristTicket);


    }

}
