package com.xworkz;

public class SlipperRunner {
    public static void main(String[] args) {

        Material mat = new Material("Rubber", 5);
        int[] ratings = {5, 4, 3};

        Slipper slipper = new Slipper(9, "Black", 499.0, ratings, Brand.PUMA, mat);
        System.out.println(slipper);
        slipper.wear();
        slipper.display();

        System.out.println("------------------");
        SportsSlipper sportsSlipper = new SportsSlipper(10, "Blue", 799.0, ratings, Brand.NIKE, mat, true, "High Grip");
        System.out.println(sportsSlipper);
        sportsSlipper.wear();
        sportsSlipper.display();
    }
}
