class Garlic {
    String variety;
    String color;
    String originCountry;
    double pricePerKg;
    double weight;
    String flavorProfile;
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
    String quality;
    String warranty;
    String brand;

    Garlic(String variety, String color, String originCountry, double pricePerKg, double weight,
           String flavorProfile, String aroma, String texture, String cultivationMethod, String harvestSeason,
           String storageMethod, String shelfLife, String nutritionalValue, String medicinalUse,
           String culinaryUse, String exportQuality, String grade, String quality, String warranty, String brand) {
        this.variety = variety;
        this.color = color;
        this.originCountry = originCountry;
        this.pricePerKg = pricePerKg;
        this.weight = weight;
        this.flavorProfile = flavorProfile;
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
        this.quality = quality;
        this.warranty = warranty;
        this.brand = brand;
    }

    void show() {
        System.out.println("Garlic Details:");
        System.out.println("Variety: " + variety);
        System.out.println("Color: " + color);
        System.out.println("Origin Country: " + originCountry);
        System.out.println("Price per Kg: $" + pricePerKg);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Flavor Profile: " + flavorProfile);
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
        System.out.println("Quality: " + quality);
        System.out.println("Warranty: " + warranty);
        System.out.println("Brand: " + brand);
        System.out.println();
    }
}