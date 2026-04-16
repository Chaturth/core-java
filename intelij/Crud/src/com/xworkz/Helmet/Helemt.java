package com.xworkz.Helmet;
class Helmet {

    String brandName;
    int weightInGrams;
    double price;
    String[] safetyFeatures;
    HelmetUse use;
    Company company;

    Helmet(String brandName, int weightInGrams, double price, String[] safetyFeatures, HelmetUse use, Company company) {
        this.brandName = brandName;
        this.weightInGrams = weightInGrams;
        this.price = price;
        this.safetyFeatures = safetyFeatures;
        this.use = use;
        this.company = company;
    }

    void wearHelmet() {
        System.out.println("Wearing " + brandName + " helmet");
    }

    void removeHelmet() {
        System.out.println("Removing helmet");
    }

    public String toString() {
        return "Helmet[brand=" + brandName + ", weight=" + weightInGrams + "g, price=" + price + ", use=" + use + ", company=" + company + "]";
    }
}
