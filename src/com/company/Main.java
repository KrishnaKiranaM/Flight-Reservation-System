package com.company;

import java.lang.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

    	Flight flight= new Flight("SP1","SpiceJet",176);
        // flight.flightnumber;  // cannot access private attributes of Flight
    	flight.setFlightNumber("SP2");   // can assign private attributes with values using setters
        System.out.println(flight.getFlightNumber()); // can access private attributes using getters


    }

}
