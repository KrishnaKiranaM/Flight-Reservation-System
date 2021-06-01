package com.company;

// Establishing nested class
//Composition relationship
//outer class
public class Passenger {

    private  static  int idCounter;
    private int id;

    // Initializing static variable
    static {
        idCounter=0;
    }
       // inner class Contact

         private static class Contact {

               private   String name;
               private   String phoneNumber;
               private   String emailid;

               // constructor with args
               public  Contact(String name, String phoneNumber, String emailid){
               this.name= name;
               this.phoneNumber=phoneNumber;
               this.emailid= emailid;
             }

              // constructor with no-args
              public  Contact(){}

              public String getName() {
              return name;
             }

             // getters and setters for handling private date and scalability
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

            // method to get passenger contact details
             public  String getContactDetails(){
             return  getName()+" "+getPhoneNumber()+" "+ getEmailid();
            }

            // method to update passenger contact details
            public  void updateContactDetails(String name,String phoneNumber,String emailid){
            setName(name);
            setPhoneNumber(phoneNumber);
            setEmailid(emailid);
           }
         }
         private  Contact contact;


          // inner class Address

        private static class Address {
            private   String street;
            private   String city;
            private   String state;

            // constructor with args
           public  Address(String street,String city, String state){
            this.street= street;
            this.city= city;
            this.state= state;
           }

             // constructor with no-args
            public  Address(){}

            // getters and setters for handling private date and scalability
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

           // method to get passenger address details
           public String getAddressDetails(){
            return  getStreet()+ " "+ getCity() +" "+ getState();
           }

           // method to update passenger details
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

    // getters and setters for handling private date and scalability
      // method to get id of passenger
      public int getId(){
        return id;
      }

      public  String getContact(){
          // calling Contact class method
          // re-usability
        return  contact.getContactDetails();
      }

      public  String getAddress(){
          // calling Contact class method
          // re-usability
        return address.getAddressDetails();
      }
}
