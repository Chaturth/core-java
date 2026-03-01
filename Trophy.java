class Trophy {

    String trophyName;
    String material;
    String color;
    double height;
    double weight;
    String shape;
    String eventName;
    String winnerName;
    int year;
    String organizer;
    String country;
    String city;
    boolean hasEngraving;
    String engravingText;
    String sponsor;
    double cost;
    String manufacturer;
    String category;
    String purpose;
    String remarks;


    Trophy(String trophyName, String material, String color, double height,
           double weight, String shape, String eventName, String winnerName,
           int year, String organizer, String country, String city,
           boolean hasEngraving, String engravingText, String sponsor,
           double cost, String manufacturer, String category,
           String purpose, String remarks)
    {
        this.trophyName = trophyName;
        this.material = material;
        this.color = color;
        this.height = height;
        this.weight = weight;
        this.shape = shape;
        this.eventName = eventName;
        this.winnerName = winnerName;
        this.year = year;
        this.organizer = organizer;
        this.country = country;
        this.city = city;
        this.hasEngraving = hasEngraving;
        this.engravingText = engravingText;
        this.sponsor = sponsor;
        this.cost = cost;
        this.manufacturer = manufacturer;
        this.category = category;
        this.purpose = purpose;
        this.remarks = remarks;
    }


    void show()
    {
        System.out.println("Running Trophy:");

        System.out.println("Trophy Name: " + trophyName);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Shape: " + shape);
        System.out.println("Event Name: " + eventName);
        System.out.println("Winner Name: " + winnerName);
        System.out.println("Year: " + year);
        System.out.println("Organizer: " + organizer);
        System.out.println("Country: " + country);
        System.out.println("City: " + city);
        System.out.println("Has Engraving: " + hasEngraving);
        System.out.println("Engraving Text: " + engravingText);
        System.out.println("Sponsor: " + sponsor);
        System.out.println("Cost: " + cost);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Category: " + category);
        System.out.println("Purpose: " + purpose);
        System.out.println("Remarks: " + remarks);

        System.out.println();
    }
}