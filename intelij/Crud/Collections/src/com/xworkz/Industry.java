package com.xworkz;

class Industry {
    String name;
    int employees;
    String location;

    Industry(String name, int employees, String location) {
        this.name = name;
        this.employees = employees;
        this.location = location;
    }

    public String toString() {
        return name + " " + employees + " " + location;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Industry) {
            Industry i = (Industry) obj;
            return this.name.equals(i.name) && this.employees == i.employees && this.location.equals(i.location);
        }
        return false;
    }
}
