package com.xworkz.MedicalShop;

class Owner {

    String ownerName;
    int experienceYears;

    Owner(String ownerName, int experienceYears) {
        this.ownerName = ownerName;
        this.experienceYears = experienceYears;
    }

    public String toString() {
        return "Owner[name=" + ownerName + ", exp=" + experienceYears + " yrs]";
    }
}
