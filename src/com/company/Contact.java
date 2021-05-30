package com.company;

public class Contact {

    String name;
    String phoneNumber;
    String emailid;

    public  Contact(String name, String phoneNumber, String emailid){
        this.name= name;
        this.phoneNumber= phoneNumber;
        this.emailid= emailid;
    }
    public  Contact(){
        this("null","null","null");
    }

    public  Contact(Contact contact){
        this.name= contact.name;
        this.phoneNumber= contact.phoneNumber;
        this.emailid= contact.emailid;
    }



    public  String getContactDetails(){
        return  name+" "+phoneNumber+" "+ emailid;
    }

    public  void updateContactDetails(String name,String phoneNumber,String emailid){
        this.name= name;
        this.phoneNumber= phoneNumber;
        this.emailid= emailid;
    }
}
