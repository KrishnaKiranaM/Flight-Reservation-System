package com.company;

public class RegularTicket {

    public String specialServices;
    Flight flight;

    public  String getSpecialServices(){
        return  specialServices;
    }

    public  void updateSpecialServices(String specialServices){
        this.specialServices= specialServices;
    }
}
