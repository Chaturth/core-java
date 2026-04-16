package com.xworkz.Concert;

public class ConcertRunner {
    public static void main(String[] args) {

        Organizer org = new Organizer("Sun Events", "Bangalore");
        String[] perf = {"DJ Alan", "Band X", "Singer Y"};

        Concert c = new Concert("Night Beats", 5000, 1500.0, perf, ConcertType.DJ, org);
        System.out.println(c);
        c.startConcert();
        c.endConcert();

        System.out.println("-----------");

        PremiumConcert pc = new PremiumConcert("Mega Fest", 10000, 3000.0, perf,
                ConcertType.FEST, org, true, "Open Stage");

        System.out.println(pc);
        pc.startConcert();
        pc.endConcert();
    }
}
