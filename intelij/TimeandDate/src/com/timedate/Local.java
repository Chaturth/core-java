package com.timedate;


import java.time.LocalDate;
import java.time.LocalTime;



public class Local {

    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        LocalTime customTime = LocalTime.of(10, 30, 45);
        System.out.println(customTime);

        LocalTime current = LocalTime.of(10,55);
        System.out.println(current);




    }
}
