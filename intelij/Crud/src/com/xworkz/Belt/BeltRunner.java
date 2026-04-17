package com.xworkz.Belt;

public class BeltRunner {
    public static void main(String[] args) {

        Brand b = new Brand("Levis", "USA");
        String[] f = {"Durable", "Flexible", "Lightweight"};

        Belt belt = new Belt("Black", 32, 1200.0, f, BeltType.LEATHER, b);
        System.out.println(belt);
        belt.wearBelt();
        belt.removeBelt();

        System.out.println("-----------");

        StylishBelt sb = new StylishBelt("Brown", 34, 1800.0, f,
                BeltType.DESIGNER, b, true, "Metal");

        System.out.println(sb);
        sb.wearBelt();
        sb.removeBelt();
    }
}
