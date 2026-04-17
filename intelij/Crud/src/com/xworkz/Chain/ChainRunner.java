package com.xworkz.Chain;

public class ChainRunner {
    public static void main(String[] args) {

        Jeweller j = new Jeweller("Malabar Gold", "Bangalore");
        String[] occ = {"Wedding", "Party", "Festival"};

        Chain c = new Chain("Simple Gold", 22, 50000.0, occ, ChainType.GOLD, j);
        System.out.println(c);
        c.wearChain();
        c.removeChain();

        System.out.println("-----------");

        FancyChain fc = new FancyChain("Diamond Style", 24, 120000.0, occ,
                ChainType.PLATINUM, j, true, "Hook");

        System.out.println(fc);
        fc.wearChain();
        fc.removeChain();
    }
}
