package com.xworkz.Helmet;

public class HelmetRunner {
    public static void main(String[] args) {

        Company comp = new Company("Vega", "India");
        String[] features = {"ISI Certified", "Shock Resistant", "Comfort Padding"};

        Helmet h = new Helmet("Vega Bolt", 1200, 1500.0, features, HelmetUse.CITY_RIDE, comp);
        System.out.println(h);
        h.wearHelmet();
        h.removeHelmet();

        System.out.println("-------------");

        SmartHelmet sh = new SmartHelmet("Steelbird SBA", 1350, 2500.0, features,
                HelmetUse.HIGHWAY_RIDE, comp, true, "Anti-Fog");

        System.out.println(sh);
        sh.wearHelmet();
        sh.removeHelmet();
    }
}
