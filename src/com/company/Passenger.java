package com.company;

public class Passenger {

    private  static   int idCounter=0;
    private int id;


      private static class Contact {

      private   String name;
      private   String phoneNumber;
      private   String emailid;

        public  Contact(String name, String phoneNumber, String emailid){
            this.name= name;
            this.phoneNumber=phoneNumber;
            this.emailid= emailid;
        }

        public  Contact(){}

          public String getName() {
              return name;
          }

          public void setName(String name) {
              this.name = name;
          }

          public String getPhoneNumber() {
              return phoneNumber;
          }

          public void setPhoneNumber(String phoneNumber) {
              this.phoneNumber = phoneNumber;
          }

          public String getEmailid() {
              return emailid;
          }

          public void setEmailid(String emailid) {
              this.emailid = emailid;
          }

          public  String getContactDetails(){
            return  getName()+" "+getPhoneNumber()+" "+ getEmailid();
        }

        public  void updateContactDetails(String name,String phoneNumber,String emailid){
            setName(name);
            setPhoneNumber(phoneNumber);
            setEmailid(emailid);
        }
      }
      private  Contact contact;


      private static class Address {
        private   String street;
        private   String city;
        private   String state;

        public  Address(String street,String city, String state){
            this.street= street;
            this.city= city;
            this.state= state;
        }


          public String getStreet() {
              return street;
          }

          public void setStreet(String street) {
              this.street = street;
          }

          public String getCity() {
              return city;
          }

          public void setCity(String city) {
              this.city = city;
          }

          public String getState() {
              return state;
          }

          public void setState(String state) {
              this.state = state;
          }

          public String getAddressDetails(){
            return  getStreet()+ " "+ getCity() +" "+ getState();
        }

        public void updateAddressDetails(String street,String city, String state){
            setStreet(street);
            setCity(city);
            setState(state);
        }
      }
      private Address address;




    public Passenger( String name, String phoneNumber, String emailid,
                      String street,String city, String state){
        this.id= ++idCounter;
        this.contact= new Contact(name, phoneNumber, emailid);
        this.address= new Address(street, city, state);
    }

    public Passenger(){}

   public int getPassengerCount(){
        return  idCounter;
   }
   public int getId(){
        return id;
   }

    public  String getContact(){
        return  contact.getContactDetails();
    }

    public  String getAddress(){
        return address.getAddressDetails();
    }
}
