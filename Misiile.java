class Missile {

    int missileId;
    String name;
    String country;
    double range;
    String type;
    String fuelType;
    double weight;
    double speed;
    boolean isActive;
    String launchPlatform;
    int yearDeveloped;
    String guidanceSystem;
    String targetType;
    double length;
    String status;

    static void defenseInfo() {
        System.out.println("Used for national defense");
    }

    static void rangeInfo() {
        System.out.println("Range varies by model");
    }

    static void fuelInfo() {
        System.out.println("Uses solid or liquid fuel");
    }

    static void safetyProtocol() {
        System.out.println("Strict safety protocols required");
    }

    static void developmentInfo() {
        System.out.println("Developed with advanced technology");
    }

    void showDetails() {
        System.out.println(missileId);
        System.out.println(name);
        System.out.println(country);
        System.out.println(range);
        System.out.println(type);
        System.out.println(fuelType);
        System.out.println(weight);
        System.out.println(speed);
        System.out.println(isActive);
        System.out.println(launchPlatform);
        System.out.println(yearDeveloped);
        System.out.println(guidanceSystem);
        System.out.println(targetType);
        System.out.println(length);
        System.out.println(status);
    }
}