package com.xworkz;

public  class CountryRunner {

    public static void main(String[] args) {

        Address address = new Address(10, 560001);
        President president = new President("Ravi", 60, address);

        Collector col1 = new Collector("Arjun", "B123");
        Collector col2 = new Collector("Kiran", "B456");

        District d1 = new District("District1", col1);
        District d2 = new District("District2", col2);

        City city1 = new City("Bangalore", new District[]{d1, d2});
        City city2 = new City("Mysore", new District[]{d1});

        State state1 = new State("Karnataka", 60000000, new City[]{city1, city2});

        Country country = new Country("India", president, new State[]{state1});

        CountryStore store = new CountryStore();
        store.save(country);

        System.out.println(store.findByName("India").name);

        System.out.println(store.findStateByStateName("Karnataka").name);

        City[] cities = store.findAllCityByStateName("Karnataka");
        for (City c : cities) {
            System.out.println(c.name);
        }

        City[] citie = store.findAllCityByStateName("Andhra Pradesh");

        if (citie != null) {
            for (City g : citie) {
                if (g != null) {
                    System.out.println(g.name);
                }
            }
        } else {
            System.out.println("No cities found for given state");
        }
    }
}



