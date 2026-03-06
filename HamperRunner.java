class HamperRunner {
    public static void main(String... args) {
        Hamper.companyPolicy();
        Hamper.displayColors();
        Hamper.capacityInfo();
        Hamper.brnadInfo();
        Hamper.priceDisplay();

        Hamper h1 = new Hamper();

        System.out.println("Display hamper 1 details:");
        h1.hamperId = 1;
        h1.material = "plastic";
        h1.color = "white";
        h1.capacity = 50;
        h1.shape = "round";
        h1.height = 10;
        h1.width = 5;
        h1.depth = 2;
        h1.hasfoldable = true;
        h1.price = 500;
        h1.brand = "indian pvt";
        h1.location = "bengaluru";
        h1.status = "good";
		
		h1.showDetails();
	
		
		Hamper h2 = new Hamper();

System.out.println("Display hamper 2 details:");
h2.hamperId = 2;
h2.material = "fabric";
h2.color = "blue";
h2.capacity = 75;
h2.shape = "square";
h2.height = 15;
h2.width = 8;
h2.depth = 4;
h2.hasfoldable = false;
h2.price = 800;
h2.brand = "global ltd";
h2.location = "mumbai";
h2.status = "excellent";

h2.showDetails();



        

        Dolphin d1 = new Dolphin(
                101,
                "Bottlenose",
                "Flipper",
                8,
                2.5,
                150.5,
                "Gray",
                "Ocean",
                "Fish",
                true,
                "John",
                "Australia",
                "Male",
                35.5,
                10,
                false,
                "Pacific Ocean",
                "Jumping",
                12,
                "Healthy"
        );

    
        Dolphin.greet();
        Dolphin.info();
        Dolphin.displayColor();
        Dolphin.displayLength();
        Dolphin.farewell();

     System.out.println("ID: " + d1.dolphinId);
        System.out.println("Species: " + d1.species);
        System.out.println("Name: " + d1.name);
        System.out.println("Age: " + d1.age);
        System.out.println("Length: " + d1.length);
        System.out.println("Weight: " + d1.weight);
        System.out.println("Color: " + d1.color);
        System.out.println("Habitat: " + d1.habitat);
        System.out.println("Diet: " + d1.diet);
        System.out.println("Is Trained: " + d1.isTrained);
        System.out.println("Trainer Name: " + d1.trainerName);
        System.out.println("Origin: " + d1.origin);
        System.out.println("Gender: " + d1.gender);
        System.out.println("Swim Speed: " + d1.swimSpeed);
        System.out.println("Jump Height: " + d1.jumpHeight);
        System.out.println("Is Endangered: " + d1.isEndangered);
        System.out.println("Ocean Region: " + d1.oceanRegion);
        System.out.println("Favorite Activity: " + d1.favoriteActivity);
        System.out.println("Daily Food Intake: " + d1.dailyFoodIntake);
        System.out.println("Health Status: " + d1.healthStatus);
		
	
		
		 Dolphin d2 = new Dolphin(
                102,
                "Spinner",
                "Dolly",
                5,
                2.1,
                120.0,
                "Light Gray",
                "Sea",
                "Squid",
                false,
                "Not Assigned",
                "India",
                "Female",
                30.0,
                8,
                true,
                "Indian Ocean",
                "Spinning",
                10,
                "Good"
        );
		System.out.println("ID: " + d2.dolphinId);
System.out.println("Species: " + d2.species);
System.out.println("Name: " + d2.name);
System.out.println("Age: " + d2.age);
System.out.println("Length: " + d2.length);
System.out.println("Weight: " + d2.weight);
System.out.println("Color: " + d2.color);
System.out.println("Habitat: " + d2.habitat);
System.out.println("Diet: " + d2.diet);
System.out.println("Is Trained: " + d2.isTrained);
System.out.println("Trainer Name: " + d2.trainerName);
System.out.println("Origin: " + d2.origin);
System.out.println("Gender: " + d2.gender);
System.out.println("Swim Speed: " + d2.swimSpeed);
System.out.println("Jump Height: " + d2.jumpHeight);
System.out.println("Is Endangered: " + d2.isEndangered);
System.out.println("Ocean Region: " + d2.oceanRegion);
System.out.println("Favorite Activity: " + d2.favoriteActivity);
System.out.println("Daily Food Intake: " + d2.dailyFoodIntake);
System.out.println("Health Status: " + d2.healthStatus);



        Bridge.safetyRule();
        Bridge.maintenanceInfo();
        Bridge.materialInfo();
        Bridge.inspectionPolicy();
        Bridge.trafficRule();

        Bridge b1 = new Bridge();

        b1.bridgeId = 1;
        b1.name = "Metro Bridge";
        b1.location = "Bengaluru";
        b1.length = 2.5;
        b1.width = 20;
        b1.type = "Suspension";
        b1.material = "Steel";
        b1.yearBuilt = 2010;
        b1.hasToll = true;
        b1.maxVehiclesPerDay = 50000;
        b1.height = 50;
        b1.riverName = "Kaveri";
        b1.country = "India";
        b1.isFamous = true;
        b1.condition = "Good";

        b1.showDetails();
		

        Penguin.speciesInfo();
        Penguin.habitatInfo();
        Penguin.foodInfo();
        Penguin.swimInfo();
        Penguin.funFact();

        Penguin p1 = new Penguin();

        p1.penguinId = 1;
        p1.name = "Pingu";
        p1.species = "Emperor";
        p1.habitat = "Antarctica";
        p1.color = "Black and White";
        p1.age = 5;
        p1.height = 1.2;
        p1.weight = 30;
        p1.canSwim = true;
        p1.canSlide = true;
        p1.diet = "Fish";
        p1.region = "South Pole";
        p1.gender = "Male";
        p1.swimSpeed = 20;
        p1.healthStatus = "Healthy";

        p1.showDetails();


        TennisBall.sportInfo();
        TennisBall.materialInfo();
        TennisBall.sizeInfo();
        TennisBall.pressureInfo();
        TennisBall.usageRule();

        TennisBall t1 = new TennisBall();

        t1.ballId = 1;
        t1.brand = "Wilson";
        t1.color = "Yellow";
        t1.weight = 58.0;
        t1.diameter = 6.7;
        t1.material = "Rubber";
        t1.isUsed = false;
        t1.bounceCount = 0;
        t1.type = "Professional";
        t1.countryMade = "USA";
        t1.price = 250;
        t1.isPressurized = true;
        t1.qualityGrade = "A";
        t1.packagingType = "Can";
        t1.condition = "New";

        t1.showDetails();
		
		
		

        Mountain.heightInfo();
        Mountain.climateInfo();
        Mountain.safetyRule();
        Mountain.tourismInfo();
        Mountain.formationInfo();

        Mountain m1 = new Mountain();

        m1.mountainId = 1;
        m1.name = "Everest";
        m1.country = "Nepal";
        m1.state = "Province 1";
        m1.height = 8848.86;
        m1.type = "Fold";
        m1.isClimbable = true;
        m1.climate = "Cold";
        m1.rockType = "Sedimentary";
        m1.yearDiscovered = 1856;
        m1.hasSnow = true;
        m1.famousFor = "Highest Peak";
        m1.trekkingRoutes = 5;
        m1.region = "Himalayas";
        m1.status = "Open";

        m1.showDetails();
		
		

        Flag.respectRule();
        Flag.designInfo();
        Flag.sizeStandard();
        Flag.usageInfo();
        Flag.historyInfo();

        Flag f1 = new Flag();

        f1.flagId = 1;
        f1.country = "India";
        f1.primaryColor = "Saffron";
        f1.secondaryColor = "Green";
        f1.symbol = "Ashoka Chakra";
        f1.shape = "Rectangle";
        f1.stripes = 3;
        f1.hasEmblem = true;
        f1.adoptionDate = "1947";
        f1.designer = "Pingali Venkayya";
        f1.length = 3.0;
        f1.width = 2.0;
        f1.material = "Khadi";
        f1.usageType = "National";
        f1.status = "Active";

        f1.showDetails();
		
		
		

        Missile.defenseInfo();
        Missile.rangeInfo();
        Missile.fuelInfo();
        Missile.safetyProtocol();
        Missile.developmentInfo();

        Missile m2 = new Missile();

        m2.missileId = 1;
        m2.name = "Agni-V";
        m2.country = "India";
        m2.range = 5000;
        m2.type = "Ballistic";
        m2.fuelType = "Solid";
        m2.weight = 50000;
        m2.speed = 24.0;
        m2.isActive = true;
        m2.launchPlatform = "Land";
        m2.yearDeveloped = 2012;
        m2.guidanceSystem = "Inertial";
        m2.targetType = "Long Range";
        m2.length = 17.5;
        m2.status = "Operational";

        m2.showDetails();
		
		
		
	

        Money.usageInfo();
        Money.securityFeature();
        Money.digitalInfo();
        Money.exchangeInfo();
        Money.reserveBankInfo();

        Money m3 = new Money();

        m3.moneyId = 1;
        m3.currencyName = "Rupee";
        m3.country = "India";
        m3.value = 500;
        m3.symbol = "₹";
        m3.type = "Note";
        m3.material = "Paper";
        m3.yearIntroduced = 2016;
        m3.governorName = "RBI Governor";
        m3.serialNumber = "AB123456";
        m3.color = "Gray";
        m3.width = 150;
        m3.height = 66;
        m3.isValid = true;
        m3.status = "Circulating";

        m3.showDetails();
		
		
		
		

        Resource.importanceInfo();
        Resource.conservationRule();
        Resource.renewableInfo();
        Resource.nonRenewableInfo();
        Resource.economicImpact();

        Resource r1 = new Resource();

        r1.resourceId = 1;
        r1.name = "Coal";
        r1.type = "Mineral";
        r1.category = "Non-Renewable";
        r1.country = "India";
        r1.state = "Jharkhand";
        r1.quantity = 5000;
        r1.unit = "Tons";
        r1.isRenewable = false;
        r1.usage = "Electricity Generation";
        r1.extractionMethod = "Mining";
        r1.yearDiscovered = 1774;
        r1.qualityGrade = "A";
        r1.marketValue = 2000000;
        r1.status = "Available";

        r1.showDetails();
    }
}
   





