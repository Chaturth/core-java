class Map {

    String mapName;
    String region;
    String country;
    String mapType;
    String scale;
    String createdBy;
    int createdYear;
    boolean hasLegend;
    boolean hasCompass;
    boolean hasGrid;
    String projectionType;
    String format;
    String colorScheme;
    String digitalOrPaper;
    String language;
    String publisher;
    double areaCovered;
    String mainFeature;
    String updateFrequency;
    String remarks;


    Map(String mapName, String region, String country, String mapType,
        String scale, String createdBy, int createdYear, boolean hasLegend,
        boolean hasCompass, boolean hasGrid, String projectionType,
        String format, String colorScheme, String digitalOrPaper,
        String language, String publisher, double areaCovered,
        String mainFeature, String updateFrequency, String remarks)
    {
        this.mapName = mapName;
        this.region = region;
        this.country = country;
        this.mapType = mapType;
        this.scale = scale;
        this.createdBy = createdBy;
        this.createdYear = createdYear;
        this.hasLegend = hasLegend;
        this.hasCompass = hasCompass;
        this.hasGrid = hasGrid;
        this.projectionType = projectionType;
        this.format = format;
        this.colorScheme = colorScheme;
        this.digitalOrPaper = digitalOrPaper;
        this.language = language;
        this.publisher = publisher;
        this.areaCovered = areaCovered;
        this.mainFeature = mainFeature;
        this.updateFrequency = updateFrequency;
        this.remarks = remarks;
    }


    void show()
    {
        System.out.println("Running Map:");

        System.out.println("Map Name: " + mapName);
        System.out.println("Region: " + region);
        System.out.println("Country: " + country);
        System.out.println("Map Type: " + mapType);
        System.out.println("Scale: " + scale);
        System.out.println("Created By: " + createdBy);
        System.out.println("Created Year: " + createdYear);
        System.out.println("Has Legend: " + hasLegend);
        System.out.println("Has Compass: " + hasCompass);
        System.out.println("Has Grid: " + hasGrid);
        System.out.println("Projection Type: " + projectionType);
        System.out.println("Format: " + format);
        System.out.println("Color Scheme: " + colorScheme);
        System.out.println("Digital Or Paper: " + digitalOrPaper);
        System.out.println("Language: " + language);
        System.out.println("Publisher: " + publisher);
        System.out.println("Area Covered: " + areaCovered + " sq km");
        System.out.println("Main Feature: " + mainFeature);
        System.out.println("Update Frequency: " + updateFrequency);
        System.out.println("Remarks: " + remarks);

        System.out.println();
    }
}