package com.xworkz.MedicalShop;

public class MedicalShopRunner {
    public static void main(String[] args) {

        Owner o = new Owner("Suresh", 15);
        String[] meds = {"Paracetamol", "Dolo", "Crocin"};

        MedicalShop ms = new MedicalShop("HealthCare", 500, 20000.0, meds, ShopType.GENERAL, o);
        System.out.println(ms);
        ms.openShop();
        ms.closeShop();

        System.out.println("------------");

        AllTimeMedicalShop ms2 = new AllTimeMedicalShop("City Medico", 800, 40000.0, meds,
                ShopType.HOSPITAL_ATTACHED, o, true, "Ambulance Support");

        System.out.println(ms2);
        ms2.openShop();
        ms2.closeShop();
    }
}
