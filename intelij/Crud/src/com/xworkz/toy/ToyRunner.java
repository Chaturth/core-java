package com.xworkz.toy;

public class ToyRunner {

    public static void main(String[] args) {

        Toy[] toy=new Toy[3];

        ToyStore toystore = new ToyStore(toy);

        Toy t1 = new Toy(false,"10/25","Car",500,"M");

        toystore.addToy(t1);

        toystore.update("Car","SpiderMan");

        toystore.search("SpiderMan");

        toystore.display();

    }
}
