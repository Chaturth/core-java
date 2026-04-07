package com.xworkz.toy;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Shop {


    String name;
    String shopSize;
    double rent;
    int noOfWorkers;
    int salary;

     Shop(String name, int noOfWorkers, double rent, int salary, String shopSize) {
        this.name = name;
        this.noOfWorkers = noOfWorkers;
        this.rent = rent;
        this.salary = salary;
        this.shopSize = shopSize;
    }

    void display() {
        System.out.println("shop name:"+name);
        System.out.println("shop size"+shopSize);
        System.out.println("rent of shop:"+rent);
        System.out.println("no of workers in shop:"+noOfWorkers);
        System.out.println("salary of  workers:"+salary);
    }
}
