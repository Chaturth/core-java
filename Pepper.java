class Pepper {
    
    String name;
    String type;
    String color;
    String originCountry;
    double pricePerKg;
    double weight;
    String flavorProfile;
    String spicinessLevel;
    String aroma;
    String texture;
    String cultivationMethod;
    String harvestSeason;
    String storageMethod;
    String shelfLife;
    String nutritionalValue;
    String medicinalUse;
    String culinaryUse;
    String exportQuality;
    String grade;
    String brand;


    Pepper(String name, String type, String color, String originCountry, double pricePerKg,
           double weight, String flavorProfile, String spicinessLevel, String aroma, String texture,
           String cultivationMethod, String harvestSeason, String storageMethod, String shelfLife,
           String nutritionalValue, String medicinalUse, String culinaryUse, String exportQuality,
           String grade, String brand) {
        this.name = name;
        this.type = type;
        this.color = color;
        this.originCountry = originCountry;
        this.pricePerKg = pricePerKg;
        this.weight = weight;
        this.flavorProfile = flavorProfile;
        this.spicinessLevel = spicinessLevel;
        this.aroma = aroma;
        this.texture = texture;
        this.cultivationMethod = cultivationMethod;
        this.harvestSeason = harvestSeason;
        this.storageMethod = storageMethod;
        this.shelfLife = shelfLife;
        this.nutritionalValue = nutritionalValue;
        this.medicinalUse = medicinalUse;
        this.culinaryUse = culinaryUse;
        this.exportQuality = exportQuality;
        this.grade = grade;
        this.brand = brand;
    }

    
    void show() {
        System.out.println("Running Pepper:");
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Origin Country: " + originCountry);
        System.out.println("Price per Kg: $" + pricePerKg);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Flavor Profile: " + flavorProfile);
        System.out.println("Spiciness Level: " + spicinessLevel);
        System.out.println("Aroma: " + aroma);
        System.out.println("Texture: " + texture);
        System.out.println("Cultivation Method: " + cultivationMethod);
        System.out.println("Harvest Season: " + harvestSeason);
        System.out.println("Storage Method: " + storageMethod);
        System.out.println("Shelf Life: " + shelfLife);
        System.out.println("Nutritional Value: " + nutritionalValue);
        System.out.println("Medicinal Use: " + medicinalUse);
        System.out.println("Culinary Use: " + culinaryUse);
        System.out.println("Export Quality: " + exportQuality);
        System.out.println("Grade: " + grade);
        System.out.println("Brand: " + brand);
        System.out.println();
    }
}