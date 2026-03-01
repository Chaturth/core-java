class Shampoo {

    String brand;
    String productName;
    String hairType;
    String fragrance;
    String color;
    double quantity;
    double price;
    String manufacturer;
    String country;
    String ingredients;
    boolean antiDandruff;
    boolean herbal;
    boolean chemicalFree;
    String packagingType;
    String expiryDate;
    String manufactureDate;
    String usageType;
    String suitableAge;
    String benefits;
    String remarks;


    Shampoo(String brand, String productName, String hairType, String fragrance,
            String color, double quantity, double price, String manufacturer,
            String country, String ingredients, boolean antiDandruff,
            boolean herbal, boolean chemicalFree, String packagingType,
            String expiryDate, String manufactureDate, String usageType,
            String suitableAge, String benefits, String remarks)
    {
        this.brand = brand;
        this.productName = productName;
        this.hairType = hairType;
        this.fragrance = fragrance;
        this.color = color;
        this.quantity = quantity;
        this.price = price;
        this.manufacturer = manufacturer;
        this.country = country;
        this.ingredients = ingredients;
        this.antiDandruff = antiDandruff;
        this.herbal = herbal;
        this.chemicalFree = chemicalFree;
        this.packagingType = packagingType;
        this.expiryDate = expiryDate;
        this.manufactureDate = manufactureDate;
        this.usageType = usageType;
        this.suitableAge = suitableAge;
        this.benefits = benefits;
        this.remarks = remarks;
    }


    void show()
    {
        System.out.println("Running Shampoo:");

        System.out.println("Brand: " + brand);
        System.out.println("Product Name: " + productName);
        System.out.println("Hair Type: " + hairType);
        System.out.println("Fragrance: " + fragrance);
        System.out.println("Color: " + color);
        System.out.println("Quantity: " + quantity + " ml");
        System.out.println("Price: " + price);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country: " + country);
        System.out.println("Ingredients: " + ingredients);
        System.out.println("Anti Dandruff: " + antiDandruff);
        System.out.println("Herbal: " + herbal);
        System.out.println("Chemical Free: " + chemicalFree);
        System.out.println("Packaging Type: " + packagingType);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Manufacture Date: " + manufactureDate);
        System.out.println("Usage Type: " + usageType);
        System.out.println("Suitable Age: " + suitableAge);
        System.out.println("Benefits: " + benefits);
        System.out.println("Remarks: " + remarks);

        System.out.println();
    }
}