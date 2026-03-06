class Mountain {

    int mountainId;
    String name;
    String country;
    String state;
    double height;
    String type;
    boolean isClimbable;
    String climate;
    String rockType;
    int yearDiscovered;
    boolean hasSnow;
    String famousFor;
    int trekkingRoutes;
    String region;
    String status;

    static void heightInfo() {
        System.out.println("Mountains have varying heights");
    }

    static void climateInfo() {
        System.out.println("Climate is usually cold");
    }

    static void safetyRule() {
        System.out.println("Climb with proper safety gear");
    }

    static void tourismInfo() {
        System.out.println("Popular tourist attraction");
    }

    static void formationInfo() {
        System.out.println("Formed by tectonic movements");
    }

    void showDetails() {
        System.out.println(mountainId);
        System.out.println(name);
        System.out.println(country);
        System.out.println(state);
        System.out.println(height);
        System.out.println(type);
        System.out.println(isClimbable);
        System.out.println(climate);
        System.out.println(rockType);
        System.out.println(yearDiscovered);
        System.out.println(hasSnow);
        System.out.println(famousFor);
        System.out.println(trekkingRoutes);
        System.out.println(region);
        System.out.println(status);
    }
}