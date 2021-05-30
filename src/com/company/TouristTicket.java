package com.company;

public class TouristTicket {

    public String[] selectTouristLocation= new String[5];
    public String hotelAddress;
    public int locCount;
    Flight flight;

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
