class Bridge {

    int bridgeId;
    String name;
    String location;
    double length;
    double width;
    String type;
    String material;
    int yearBuilt;
    boolean hasToll;
    int maxVehiclesPerDay;
    double height;
    String riverName;
    String country;
    boolean isFamous;
    String condition;

    static void safetyRule() {
        System.out.println("Follow bridge safety rules");
    }

    static void maintenanceInfo() {
        System.out.println("Maintenance required yearly");
    }

    static void materialInfo() {
        System.out.println("Made of steel and concrete");
    }

    static void inspectionPolicy() {
        System.out.println("Inspection is mandatory");
    }

    static void trafficRule() {
        System.out.println("Follow speed limits");
    }

    void showDetails() {
        System.out.println(bridgeId);
        System.out.println(name);
        System.out.println(location);
        System.out.println(length);
        System.out.println(width);
        System.out.println(type);
        System.out.println(material);
        System.out.println(yearBuilt);
        System.out.println(hasToll);
        System.out.println(maxVehiclesPerDay);
        System.out.println(height);
        System.out.println(riverName);
        System.out.println(country);
        System.out.println(isFamous);
        System.out.println(condition);
    }
}