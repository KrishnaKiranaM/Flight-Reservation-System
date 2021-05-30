package com.company;

public class Passenger {

    public  int id;

    public  String street;
    public  String city;
    public  String state;

    public String name;
    public String phoneNumber;
    public String emailid;

    Address address;
    Contact contact;

    public Passenger(int id, String name, String phoneNumber, String emailid, String street,String city, String state){
        this.id=id;
        this.name= name;
        this.phoneNumber= phoneNumber;
        this.emailid= emailid;
        this.street= street;
        this.city= city;
        this.state= state;
    }
    public Passenger(){
        this(0,"null","null","null","null","null","null");
    }
    public Passenger(Passenger passenger){
        this.id= passenger.id;
        this.name= passenger.name;
        this.phoneNumber= passenger.phoneNumber;
        this.emailid= passenger.emailid;
        this.street= passenger.street;
        this.city= passenger.city;
        this.state= passenger.state;
    }


    public  String getContact(){
        return  name+" "+phoneNumber+" "+ emailid;
    }

    public  String getAddress(){
        return street + " "+ city +" "+ state;
    }
}
