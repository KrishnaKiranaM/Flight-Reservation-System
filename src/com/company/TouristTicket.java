package com.company;

public class TouristTicket extends  Ticket{

    private   String[] selectTouristLocation= new String[5];
    private String hotelAddress;
    private int locCount;

    public  TouristTicket(String pnr,Passenger passenger,Flight flight,String seatNumber, String boarding, String destination,
                          String departureDateTime, String arrivalDateTime, boolean cancelled,String touristLocation, String hotelAddress){

        // Constructor overloading using super keyword inorder to invoke parent class constructor
        super(pnr, passenger, flight, seatNumber, boarding, destination, departureDateTime, arrivalDateTime, cancelled);
         this.setSelectTouristLocation(touristLocation);

         this.hotelAddress= hotelAddress;
    }

    // getters and setters for handling private date and scalability

    /*Methods accepts tourist locations selected by passenger
      It can be scalable using String array as input */
    public void setSelectTouristLocation(String touristLocation) {
        String[] str= touristLocation.split("[, ]+");
       int len= str.length;

             for (int i=0;i<len;i++) {
                 this.selectTouristLocation[i] = str[i];
             }
             for(int i=len;i<5;i++){
                 this.selectTouristLocation[i]="None";
             }

    }

    // method return Tourist locations selected by Passenger
    public String[] getSelectTouristLocation() {
        System.out.println("Tourist locations selected by PNR "+ this.getPnr());
        return this.selectTouristLocation;
    }

    /*It can be scalable using different hotel addresses with respect to selected Tourist locations*/
    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public int getLocCount() {
        return this.locCount;
    }


    // method return hotel address according to tourist location
    public String getHotelAddress() {
        return this.hotelAddress;
    }


    public  String getStatus(){
        if(super.isCancelled()){
            return "Ticket Cancelled";
        }
        else {
            return super.getStatus()+" "+ this.hotelAddress;
        }
    }

     // Internal Method, Cannot be accessed from outside class
    public void displaySelectedTouristLocations(){
            for (String s: this.getSelectTouristLocation()){
                System.out.println(s);
            }
    }


       // remove tourist location
    public void removeTouristLocation(String touristLocation){
        for(int i=0; i<5; i++) {
            if (this.selectTouristLocation[i] == touristLocation) {
                this.selectTouristLocation[i] = "None";
            }
          }
    }


    /* method checks for number of tourist locations selected by passenger,
       checks number of locations selected by passenger is max(5 locations)  or not
       if not max,checks if the selected location is already present in selected list,
       if not present in the list ,then assigns the selected location to the list */
    public void addTouristLocation(String touristLocation) {
        if(isLocationMax()==false){
            for(int i=0;i<5;i++){
                if(this.selectTouristLocation[i].equals("None") && this.selectTouristLocation[i].equalsIgnoreCase(touristLocation)==false){
                    this.selectTouristLocation[i]= touristLocation;
                    break;
                }
            }
        }
        else System.out.println("Max location selected");;
    }


    // method checks if the number location selected by passenger is max,ie 5.
    // Displays, how many more location/locations can be added
    public boolean isLocationMax(){
        this.locCount=0;
        for(int i=0;i<5;i++){
            if(this.selectTouristLocation[i]!="None"){
                this.locCount++;
            }
        }

        if(this.locCount==5){
            return true;
        }
        else{
            System.out.println("You can add "+(5-locCount)+" more location/locations");
            return false;
        }
    }
}
