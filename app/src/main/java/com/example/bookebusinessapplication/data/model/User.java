package com.example.bookebusinessapplication.data.model;

import com.example.bookebusinessapplication.data.dao.UserInterface;

public class User implements UserInterface {


    private String businessName;
    private String email;
    private String password;
    private String dateRegistered;
    private String businessType;
    private String phoneNumber;
    private String location;


    public User() {

    }


    public User(String businessName, String email, String password, String dateRegistered, String businessType, String phoneNumber, String location)
    {
        this.businessName = businessName;
        this.email = email;
        this.password = password;
        this.dateRegistered = dateRegistered;
        this. businessType = businessType;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }


    public String getBusinessName() {return businessName;}
    public void setBusinessName(String businessName) {this.businessName = businessName;}

    public String getEmail() {return email;}
    public void setEmail(String email){this.email = email;}

    public String getPassword(){return password;}
    public void setPassword(String password){this.password = password;}

    public String getDateRegistered(){return dateRegistered;}
    public void setDateRegistered(String dateRegistered){this.dateRegistered = dateRegistered;}

    public String getBusinessType(){return businessType;}
    public void setBusinessType(String businessType){this.businessType = businessType;}

    public String getPhoneNumber(){return phoneNumber;}
    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}

    public String getLocation(){return  location;}
    public void setLocation(String location){this.location = location;}


    @Override
    public String toString() {
        return "User{" +
                "businessName='" + businessName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", dateRegistered='" + dateRegistered + '\'' +
                ", businessType='" + businessType + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
