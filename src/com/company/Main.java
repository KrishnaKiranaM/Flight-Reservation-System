package com.company;

import java.lang.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	Passenger passenger= new Passenger(1,"Krishna Kirana","9663627592","kiiran837@gmail.com","Ps Nagar","Kasaragod","Kerala");
	Address address= new Address("Mujunagvu","Kumbla","Kerala");
	Contact contact= new Contact("Keerthana","7560965513","keerth67@gmail.com");
	Flight flight= new Flight("SP1","SpiceJet",176);


		System.out.println(passenger.getAddress());
		System.out.println(passenger.getContact());
		System.out.println(address.getAddressDetails());
		System.out.println(contact.getContactDetails());
		System.out.println(flight.getFlightDetails());


    }

}
