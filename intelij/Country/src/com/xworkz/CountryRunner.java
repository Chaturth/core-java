package com.xworkz;

public class CountryRunner {

    public static void main(String[] args) {


        Address address = new Address(10, 560001);
        President president = new President("Ravi", 60, address);

        Collector col1 = new Collector("Arjun", "B123");
        Collector col2 = new Collector("Kiran", "B456");

        District d1 = new District("Chikkamagalury", col1);
        District d2 = new District("Mysore", col2);


        District[] bangaloreDistricts = new District[2];
        bangaloreDistricts[0] = d1;
        bangaloreDistricts[1] = d2;

        District[] mysoreDistricts = new District[1];
        mysoreDistricts[0] = d1;


        City city1 = new City("Bangalore", bangaloreDistricts);
        City city2 = new City("Mysore", mysoreDistricts);


        City[] cities = new City[2];
        cities[0] = city1;
        cities[1] = city2;


        State state1 = new State("Karnataka", 60000000, cities);

        State[] states = new State[1];
        states[0] = state1;


        Country country = new Country("India", president, states);

        CountryStore store = new CountryStore();
        store.save(country);

        State foundState = store.findStateByStateName("Karnataka");

        if (foundState != null) {

            System.out.println("State Name: " + foundState.name);
            System.out.println("Population: " + foundState.population);

            for (City city : foundState.cities) {
                if (city != null) {

                    System.out.println("City: " + city.name);

                    for (District d : city.districts) {
                        if (d != null) {
                            System.out.println("  District: " + d.name);
                            System.out.println("  Collector: " + d.collector.name);
                        }
                    }
                }
            }

        } else {
            System.out.println("State not found");
        }
    }
}



