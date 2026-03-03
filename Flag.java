class Flag {

    int flagId;
    String country;
    String primaryColor;
    String secondaryColor;
    String symbol;
    String shape;
    int stripes;
    boolean hasEmblem;
    String adoptionDate;
    String designer;
    double length;
    double width;
    String material;
    String usageType;
    String status;

    static void respectRule() {
        System.out.println("Always respect the national flag");
    }

    static void designInfo() {
        System.out.println("Each flag has unique design elements");
    }

    static void sizeStandard() {
        System.out.println("Flags follow standard size ratios");
    }

    static void usageInfo() {
        System.out.println("Used during national events");
    }

    static void historyInfo() {
        System.out.println("Represents history and culture");
    }

    void showDetails() {
        System.out.println(flagId);
        System.out.println(country);
        System.out.println(primaryColor);
        System.out.println(secondaryColor);
        System.out.println(symbol);
        System.out.println(shape);
        System.out.println(stripes);
        System.out.println(hasEmblem);
        System.out.println(adoptionDate);
        System.out.println(designer);
        System.out.println(length);
        System.out.println(width);
        System.out.println(material);
        System.out.println(usageType);
        System.out.println(status);
    }
}