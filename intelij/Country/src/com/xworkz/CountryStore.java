package com.xworkz;

public class CountryStore {

    Country[] countries;
    int currentIndex=0;


    public CountryStore() {
        this.countries = new Country[10];
    }

    void save(Country country){
        int index;
        index = countries.length;
        if(country!=null){
            if(currentIndex<index){
                countries[currentIndex]=country;
                currentIndex++;
                System.out.println("Country is saved successfully:"+country.name);
            }
            else{
                System.out.println("Array is full cant add more data");
            }
        }
    }

    Country findByName(String name) {
        boolean found = false;

        for (Country country : countries) {
            if (country != null) {
                if (name != null && name.equals(country.name)) {
                    System.out.println("Country found:" + country.name);
                    return country;

                }
            }
        }
        if (!found) {
            System.out.println("name is not found");
        }
        return null;
    }

    State findStateByStateName(String name){
            boolean found=false;

            for(Country country:countries){
                if(country!=null){
                    for(State state:country.states){
                        if(state.name.equals(name)){
                            System.out.println("State names successfully found");
                            return state;

                        }
                    }
                }
                if(!found){
                    System.out.println("State not found");
                }

            }

        return null;
    }

    City[] findAllCityByStateName(String name) {
        for (Country c : countries) {
            if (c != null) {
                for (State s : c.states) {
                    if (s.name.equalsIgnoreCase(name)) {
                        return s.cities;
                    }
                }
            }
        }
        return null;
    }
}
