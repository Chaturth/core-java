package com.xworkz.Helmet;

class Company {
    String companyName;
    String country;

    Company(String companyName, String country) {
        this.companyName = companyName;
        this.country = country;
    }

    public String toString() {
        return "Company[name=" + companyName + ", country=" + country + "]";
    }
}
