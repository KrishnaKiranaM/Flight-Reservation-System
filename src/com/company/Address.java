package com.company;

public class Address {
    public  String street;
    public  String city;
    public  String state;

    public  Address(String street,String city, String state){
        this.street= street;
        this.city= city;
        this.state= state;
    }

    public  Address(){
        this("null","null","null");
    }

    public  Address(Address address){
        this.street= address.street;
        this.city= address.city;
        this.state= address.state;
    }

    public String getAddressDetails(){
        return  street + " "+ city +" "+ state;
    }

    public void updateAddressDetails(String street,String city, String state){
        this.street= street;
        this.city= city;
        this.state= state;
    }
}


