package com.company;

public class TouristTicket extends  Ticket{

    private String[] selectTouristLocation= new String[5];
    private String hotelAddress;
    private int locCount;

    public  TouristTicket(String pnr,Passenger passenger,Flight flight,String seatNumber, String boarding, String destination, String departureDateTime, String arrivalDateTime, boolean cancelled, String[] selectTouristLocation, String hotelAddress){
        super(pnr, passenger, flight, seatNumber, boarding, destination, departureDateTime, arrivalDateTime, cancelled);
         this.selectTouristLocation= selectTouristLocation;
         this.hotelAddress= hotelAddress;
    }
    public String[] getSelectTouristLocation() {
        return selectTouristLocation;
    }

    public void setSelectTouristLocation(String[] selectTouristLocation) {
        this.selectTouristLocation = selectTouristLocation;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public int getLocCount() {
        return locCount;
    }


    public String getHotelAddress() {
        return hotelAddress;
    }

    public String[] getTouristLocation() {
        return selectTouristLocation;
    }
    public void removeTouristLocation(String touristLocation){
        for(int i=1; i<=5; i++) {
            if (selectTouristLocation[i] == touristLocation) {
                selectTouristLocation[i] = "null";
            }
          }
    }

    public void addTouristLocation(String touristLocation) {
        if(isLocationMax()==false){
            for(int i=1;i<=5;i++){
                if(selectTouristLocation[i]=="null"){
                    selectTouristLocation[i]= touristLocation;
                }
            }
        }
    }

    public boolean isLocationMax(){
        locCount=0;
        for(int i=1;i<=5;i++){
            if(selectTouristLocation[i]=="null"){
                locCount++;
            }
        }
        if(locCount==0){
            return true;
        }
        else{
            return false;
        }
    }
}
