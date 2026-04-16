package com.xworkz.Actor;

class Manager {

    String managerName;
    int experienceYears;

    Manager(String managerName, int experienceYears) {
        this.managerName = managerName;
        this.experienceYears = experienceYears;
    }

    public String toString() {
        return "Manager[name=" + managerName + ", exp=" + experienceYears + " yrs]";
    }
}
