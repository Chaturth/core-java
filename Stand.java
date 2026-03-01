class Stand {

    String standName;
    String location;
    int numberOfPlatforms;
    int numberOfBuses;
    String type;
    String managerName;
    int openingYear;
    boolean hasParking;
    boolean hasRestroom;
    boolean hasFoodCourt;
    int dailyPassengers;
    String mainRoute;
    String city;
    String state;
    String country;
    String transportService;
    String ticketSystem;
    String securityLevel;
    String maintenanceCompany;
    String remarks;


    Stand(String standName, String location, int numberOfPlatforms, int numberOfBuses,
          String type, String managerName, int openingYear, boolean hasParking,
          boolean hasRestroom, boolean hasFoodCourt, int dailyPassengers,
          String mainRoute, String city, String state, String country,
          String transportService, String ticketSystem, String securityLevel,
          String maintenanceCompany, String remarks)
    {
        this.standName = standName;
        this.location = location;
        this.numberOfPlatforms = numberOfPlatforms;
        this.numberOfBuses = numberOfBuses;
        this.type = type;
        this.managerName = managerName;
        this.openingYear = openingYear;
        this.hasParking = hasParking;
        this.hasRestroom = hasRestroom;
        this.hasFoodCourt = hasFoodCourt;
        this.dailyPassengers = dailyPassengers;
        this.mainRoute = mainRoute;
        this.city = city;
        this.state = state;
        this.country = country;
        this.transportService = transportService;
        this.ticketSystem = ticketSystem;
        this.securityLevel = securityLevel;
        this.maintenanceCompany = maintenanceCompany;
        this.remarks = remarks;
    }


    void show()
    {
        System.out.println("Running Stand:");

        System.out.println("Stand Name: " + standName);
        System.out.println("Location: " + location);
        System.out.println("Platforms: " + numberOfPlatforms);
        System.out.println("Number Of Buses: " + numberOfBuses);
        System.out.println("Type: " + type);
        System.out.println("Manager: " + managerName);
        System.out.println("Opening Year: " + openingYear);
        System.out.println("Parking Available: " + hasParking);
        System.out.println("Restroom Available: " + hasRestroom);
        System.out.println("Food Court Available: " + hasFoodCourt);
        System.out.println("Daily Passengers: " + dailyPassengers);
        System.out.println("Main Route: " + mainRoute);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Country: " + country);
        System.out.println("Transport Service: " + transportService);
        System.out.println("Ticket System: " + ticketSystem);
        System.out.println("Security Level: " + securityLevel);
        System.out.println("Maintenance Company: " + maintenanceCompany);
        System.out.println("Remarks: " + remarks);

        System.out.println();
    }
}