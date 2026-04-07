package com.xworkz.medical;

public class MedicalStoreRunner {

    public static void main(String[] args) {

        Medical[] medical = new Medical[3];

        MedicalStore store = new MedicalStore(medical);

        Medical m1 = new Medical("Apollo", 5, 5000, 20000, "Retail");

        store.addMedical(m1);

        store.update("Apollo", "ApolloPlus");

        store.search("ApolloPlus");

        store.display();
    }
}
