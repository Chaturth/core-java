package com.xworkz;

public class Runner {
    public static void main(String[] args) {

        Wire w1 = new Wire("Copper", 10.5, "Red");
        Wire w2 = new Wire("Copper", 9.5, "Red");
        System.out.println(w1.equals(w2));

        System.out.println(w1);

        System.out.println(w2.toString());

        WaterMelon wm1 = new WaterMelon(5.2, "India", "Sweet");
        WaterMelon wm2 = new WaterMelon(5.2, "India", "Sweet");
        System.out.println(wm1.equals(wm2));
        System.out.println(wm1);
        System.out.println(wm2);

        Crown c1 = new Crown("Gold", 50000, 2);
        Crown c2 = new Crown("Gold", 50000, 2);
        System.out.println(c1.equals(c2));
        System.out.println(c1);
        System.out.println(c2);

        Industry i1 = new Industry("IT", 1000, "Bangalore");
        Industry i2 = new Industry("IT", 1000, "Bangalore");
        System.out.println(i1.equals(i2));
        System.out.println(i1);
        System.out.println(i2);

        Oil o1 = new Oil("Fortune", 150, "Sunflower");
        Oil o2 = new Oil("Fortune", 150, "Sunflower");
        System.out.println(o1.equals(o2));
        System.out.println(o1);
        System.out.println(o2);

        ToothPaste t1 = new ToothPaste("Colgate", 200, "Mint");
        ToothPaste t2 = new ToothPaste("Colgate", 200, "Mint");
        System.out.println(t1);
        System.out.println(t1.equals(t2));

        Diamond d1 = new Diamond(1.5, "White", 80000);
        Diamond d2 = new Diamond(1.5, "White", 80000);
        System.out.println(d1);
        System.out.println(d1.equals(d2));

        Fork f1 = new Fork("Steel", 4, "Medium");
        Fork f2 = new Fork("Steel", 4, "Medium");
        System.out.println(f1);
        System.out.println(f1.equals(f2));

        Trolley tr1 = new Trolley("VIP", 4, "Black");
        Trolley tr2 = new Trolley("VIP", 4, "Black");
        System.out.println(tr1);
        System.out.println(tr1.equals(tr2));

        Sim s1 = new Sim("Jio", "4G", 299);
        Sim s2 = new Sim("Jio", "4G", 299);
        System.out.println(s1);
        System.out.println(s1.equals(s2));



    }
}
