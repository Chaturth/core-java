class Resource {

    int resourceId;
    String name;
    String type;
    String category;
    String country;
    String state;
    double quantity;
    String unit;
    boolean isRenewable;
    String usage;
    String extractionMethod;
    int yearDiscovered;
    String qualityGrade;
    double marketValue;
    String status;

    static void importanceInfo() {
        System.out.println("Resources are essential for development");
    }

    static void conservationRule() {
        System.out.println("Use resources wisely");
    }

    static void renewableInfo() {
        System.out.println("Some resources are renewable");
    }

    static void nonRenewableInfo() {
        System.out.println("Some resources are limited");
    }

    static void economicImpact() {
        System.out.println("Resources impact national economy");
    }

    void showDetails() {
        System.out.println(resourceId);
        System.out.println(name);
        System.out.println(type);
        System.out.println(category);
        System.out.println(country);
        System.out.println(state);
        System.out.println(quantity);
        System.out.println(unit);
        System.out.println(isRenewable);
        System.out.println(usage);
        System.out.println(extractionMethod);
        System.out.println(yearDiscovered);
        System.out.println(qualityGrade);
        System.out.println(marketValue);
        System.out.println(status);
    }
}