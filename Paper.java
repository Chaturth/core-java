class Paper {
    String brand;
    String type;
    String color;
    double thickness;
    double weight;
    String size;
    String texture;
    String finish;
    String originCountry;
    double pricePerPack;
    int sheetsPerPack;
    String usage;
    String ecoFriendly;
    String waterResistance;
    String fireResistance;
    String recyclability;
    String grade;
    String quality;
    String warranty;
    String collectionName;

    Paper(String brand, String type, String color, double thickness, double weight,
          String size, String texture, String finish, String originCountry, double pricePerPack,
          int sheetsPerPack, String usage, String ecoFriendly, String waterResistance,
          String fireResistance, String recyclability, String grade, String quality,
          String warranty, String collectionName) {
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.thickness = thickness;
        this.weight = weight;
        this.size = size;
        this.texture = texture;
        this.finish = finish;
        this.originCountry = originCountry;
        this.pricePerPack = pricePerPack;
        this.sheetsPerPack = sheetsPerPack;
        this.usage = usage;
        this.ecoFriendly = ecoFriendly;
        this.waterResistance = waterResistance;
        this.fireResistance = fireResistance;
        this.recyclability = recyclability;
        this.grade = grade;
        this.quality = quality;
        this.warranty = warranty;
        this.collectionName = collectionName;
    }

    void show() {
        System.out.println("Paper Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Thickness: " + thickness + " mm");
        System.out.println("Weight: " + weight + " gsm");
        System.out.println("Size: " + size);
        System.out.println("Texture: " + texture);
        System.out.println("Finish: " + finish);
        System.out.println("Origin Country: " + originCountry);
        System.out.println("Price per Pack: $" + pricePerPack);
        System.out.println("Sheets per Pack: " + sheetsPerPack);
        System.out.println("Usage: " + usage);
        System.out.println("Eco-Friendly: " + ecoFriendly);
        System.out.println("Water Resistance: " + waterResistance);
        System.out.println("Fire Resistance: " + fireResistance);
        System.out.println("Recyclability: " + recyclability);
        System.out.println("Grade: " + grade);
        System.out.println("Quality: " + quality);
        System.out.println("Warranty: " + warranty);
        System.out.println("Collection Name: " + collectionName);
        System.out.println();
    }
}