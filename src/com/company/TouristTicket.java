package com.company;

public class TouristTicket extends  Ticket{

    private String[] selectTouristLocation= new String[5];
    private String hotelAddress;
    private int locCount;

    public  TouristTicket(String pnr,Passenger passenger,Flight flight,String seatNumber, String boarding, String destination,
                          String departureDateTime, String arrivalDateTime, boolean cancelled,String touristLocation, String hotelAddress){

        super(pnr, passenger, flight, seatNumber, boarding, destination, departureDateTime, arrivalDateTime, cancelled);
         this.setSelectTouristLocation(touristLocation);
         this.hotelAddress= hotelAddress;
    }

    public String[] getSelectTouristLocation() {
        return selectTouristLocation;
    }

    public void setSelectTouristLocation(String selectTouristLocation) {
        this.addTouristLocation(selectTouristLocation);
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
        for(int i=0; i<5; i++) {
            if (this.selectTouristLocation[i] == touristLocation) {
                this.selectTouristLocation[i] = "null";
            }
          }
    }

    public void addTouristLocation(String touristLocation) {
        if(isLocationMax()==false){
            for(int i=1;i<=5;i++){
                if(this.selectTouristLocation[i].equals("null") && this.selectTouristLocation[i].equalsIgnoreCase(touristLocation)==false){
                    this.selectTouristLocation[i]= touristLocation;
                }
            }
        }
    }

    public boolean isLocationMax(){
        locCount=0;
        for(int i=0;i<5;i++){
            if(this.selectTouristLocation[i]!="null"){
                locCount++;
            }
        }
        if(locCount==5){
            return true;
        }
        else{
            return false;
        }
    }
}
