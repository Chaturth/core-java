class Dumbbell {

    String brand;
    double weight;
    String material;
    String color;
    String shape;
    boolean adjustable;
    String gripType;
    double length;
    double handleDiameter;
    String coating;
    String usageType;
    String ownerName;
    String gymName;
    int quantity;
    double price;
    String manufacturer;
    String country;
    String durability;
    String storageType;
    String remarks;


    Dumbbell(String brand, double weight, String material, String color,
             String shape, boolean adjustable, String gripType,
             double length, double handleDiameter, String coating,
             String usageType, String ownerName, String gymName,
             int quantity, double price, String manufacturer,
             String country, String durability, String storageType,
             String remarks)
    {
        this.brand = brand;
        this.weight = weight;
        this.material = material;
        this.color = color;
        this.shape = shape;
        this.adjustable = adjustable;
        this.gripType = gripType;
        this.length = length;
        this.handleDiameter = handleDiameter;
        this.coating = coating;
        this.usageType = usageType;
        this.ownerName = ownerName;
        this.gymName = gymName;
        this.quantity = quantity;
        this.price = price;
        this.manufacturer = manufacturer;
        this.country = country;
        this.durability = durability;
        this.storageType = storageType;
        this.remarks = remarks;
    }


    void show()
    {
        System.out.println("Running Dumbbell:");

        System.out.println("Brand: " + brand);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Shape: " + shape);
        System.out.println("Adjustable: " + adjustable);
        System.out.println("Grip Type: " + gripType);
        System.out.println("Length: " + length + " cm");
        System.out.println("Handle Diameter: " + handleDiameter + " cm");
        System.out.println("Coating: " + coating);
        System.out.println("Usage Type: " + usageType);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Gym Name: " + gymName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country: " + country);
        System.out.println("Durability: " + durability);
        System.out.println("Storage Type: " + storageType);
        System.out.println("Remarks: " + remarks);

        System.out.println();
    }
}