package com.example.bookebusinessapplication.data.model;


import com.example.bookebusinessapplication.data.dao.Message;

public class Event implements Message
{
    private String userName;
    private String title;
    private String type;
    private Double lat;
    private Double lon;


    public Event()
    {

    }



    public Event(String userName, String title, String type, Double lat, Double lon)
    {
        this.userName = userName;
        this.title = title;
        this.type = type;
        this.lat = lat;
        this.lon = lon;
    }


    public String getUsername(){return userName;}
    public void setUsername(String userName){this.userName = userName;}

    public String getTitle(){return title;}
    public void setTitle(String title){this.title = title;}

    public String getType(){return type;}
    public void setType(String type) {this.type = type;}

    public Double getLat(){return lat;}
    public void setLat(Double lat) {this.lat=lat;}

    public Double getLon(){return lon;}
    public void setLon(Double lon){this.lon = lon;}

    @Override
    public String toString() {
        return "Event{" +
                "userName='" + userName + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                '}';
    }
}
