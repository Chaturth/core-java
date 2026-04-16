package com.xworkz.Information;

public class InformationRunner {
    public static void main(String[] args) {

        Source s = new Source("Website", "Internet");
        String[] keys = {"Java", "OOP", "Inheritance"};

        Information info = new Information("Java Notes", 120, 2.5, keys, InfoType.TECHNICAL, s);
        System.out.println(info);
        info.displayInfo();
        info.saveInfo();

        System.out.println("-------------");

        DigitalInformation di = new DigitalInformation("Cyber Security Guide", 200, 5.0, keys,
                InfoType.TECHNICAL, s, true, "PDF");

        System.out.println(di);
        di.displayInfo();
        di.saveInfo();
    }
}
