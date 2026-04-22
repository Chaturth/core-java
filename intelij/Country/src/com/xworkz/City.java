package com.xworkz;

public class City {
    String name;
    int noOfDistricts;
    District[] districts;

    City(String name, District[] districts) {
        this.name = name;
        this.districts = districts;
        this.noOfDistricts = districts.length;
    }
}
