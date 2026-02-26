package com.example.androiduitesting;

public class City {
    private String city;
    private String province;

    City(String city){
        this.city = city;
        this.province = "Hehe";
    }

    String getCityName(){
        return this.city;
    }

    String getProvinceName(){
        return this.province;
    }
}
