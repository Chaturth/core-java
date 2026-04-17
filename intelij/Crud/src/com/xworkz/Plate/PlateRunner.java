package com.xworkz.Plate;

public class PlateRunner {
    public static void main(String[] args) {

        Manufacturer m = new Manufacturer("Classic Utensils", "India");
        String[] u = {"Eating", "Serving", "Party"};

        Plate p = new Plate("White", 12, 150.0, u, PlateType.CERAMIC, m);
        System.out.println(p);
        p.usePlate();
        p.washPlate();

        System.out.println("-----------");

        DisposablePlate dp = new DisposablePlate("Silver", 10, 50.0, u,
                PlateType.PAPER, m, true, "Medium");

        System.out.println(dp);
        dp.usePlate();
        dp.washPlate();
    }
}
