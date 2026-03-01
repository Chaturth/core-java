class Wallpaper {
    
    String brand;
    String material;
    String color;
    String pattern;
    double price;
    double width;
    double height;
    String finish;
    String roomType;
    String originCountry;
    String texture;
    String durability;
    String fireResistance;
    String waterResistance;
    String ecoFriendly;
    String adhesiveType;
    String cleaningMethod;
    String warranty;
    String style;
    String collectionName;

   
    Wallpaper(String brand, String material, String color, String pattern, double price,
              double width, double height, String finish, String roomType, String originCountry,
              String texture, String durability, String fireResistance, String waterResistance,
              String ecoFriendly, String adhesiveType, String cleaningMethod, String warranty,
              String style, String collectionName) {
        this.brand = brand;
        this.material = material;
        this.color = color;
        this.pattern = pattern;
        this.price = price;
        this.width = width;
        this.height = height;
        this.finish = finish;
        this.roomType = roomType;
        this.originCountry = originCountry;
        this.texture = texture;
        this.durability = durability;
        this.fireResistance = fireResistance;
        this.waterResistance = waterResistance;
        this.ecoFriendly = ecoFriendly;
        this.adhesiveType = adhesiveType;
        this.cleaningMethod = cleaningMethod;
        this.warranty = warranty;
        this.style = style;
        this.collectionName = collectionName;
    }

  
    void show() {
        System.out.println("Running Wallpaper:");
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Pattern: " + pattern);
        System.out.println("Price: $" + price);
        System.out.println("Width: " + width + " meters");
        System.out.println("Height: " + height + " meters");
        System.out.println("Finish: " + finish);
        System.out.println("Room Type: " + roomType);
        System.out.println("Origin Country: " + originCountry);
        System.out.println("Texture: " + texture);
        System.out.println("Durability: " + durability);
        System.out.println("Fire Resistance: " + fireResistance);
        System.out.println("Water Resistance: " + waterResistance);
        System.out.println("Eco-Friendly: " + ecoFriendly);
        System.out.println("Adhesive Type: " + adhesiveType);
        System.out.println("Cleaning Method: " + cleaningMethod);
        System.out.println("Warranty: " + warranty);
        System.out.println("Style: " + style);
        System.out.println("Collection Name: " + collectionName);
        System.out.println();
    }
}