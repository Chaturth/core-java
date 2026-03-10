class ArrayRunner{
	
	public static void main(String... args)
	{
		
		String[] types=new String[3];
		types[0]="dotmatrix";
		types[1]="inkjet";
		types[2]="laser";
		
		Brands[] brands=new Brands[3];
		brands[0]=new Brands("HP");
		brands[1]=new Brands("Assus");
		brands[2]=new Brands("Dell");
		
		Printer printer=new Printer(types,brands);
		printer.display();
		
		
        String[] styles = new String[3];
        styles[0] = "Oil Painting";
        styles[1] = "Watercolor";
        styles[2] = "Acrylic";
        PaintBrand[] brand = new PaintBrand[3];
        brand[0] = new PaintBrand("Camel");
        brand[1] = new PaintBrand("Brustro");
        brand[2] = new PaintBrand("Winsor");
        Painter painter = new Painter(styles, brand);

        painter.display();
		
		String[] tools=new String[3];
		tools[0]="hammer ";
		tools[1]=" nail";
		tools[2]="cutting machine ";
		
		Material[] m=new Material[3];
		m[0]=new Material("playwood");
		
		m[2]=new Material("wood");
		m[1]=new Material("door");
		
		Carpenter carpenter=new Carpenter(tools,m);
		carpenter.display();
		
		String[] foodItems=new String[3];
		foodItems[0]="iddli";
		foodItems[1]="dosa";
		foodItems[2]="puuri";
		
		HotelBrand[] hotel=new HotelBrand[3];
		hotel[0]=new HotelBrand("parijatha");
		hotel[1]=new HotelBrand("pie");
		hotel[2]=new HotelBrand("coffee bee");
		
		Serverhotel serverhotel=new Serverhotel(foodItems,hotel);
		serverhotel.display();
		
		String[] jokes = new String[3];
        jokes[0] = "Funny Joke";
        jokes[1] = "Magic Trick Joke";
        jokes[2] = "Stage Comedy";

        Audience[] audiences = new Audience[3];
        audiences[0] = new Audience("Kids");
        audiences[1] = new Audience("Adults");
        audiences[2] = new Audience("Family");

        Joker joker = new Joker(jokes, audiences);
        joker.display();
		
		 String[] scanTypes = new String[3];
        scanTypes[0] = "Flatbed Scan";
        scanTypes[1] = "Sheetfed Scan";
        scanTypes[2] = "Photo Scan";

        Device[] devices = new Device[3];
        devices[0] = new Device("Canon Scanner");
        devices[1] = new Device("HP Scanner");
        devices[2] = new Device("Epson Scanner");

        Scanner scanner = new Scanner(scanTypes, devices);
        scanner.display();
		
		 String[] clients = new String[3];
        clients[0] = "Alice";
        clients[1] = "Bob";
        clients[2] = "Charlie";
        Person[] people = new Person[3];
        people[0] = new Person("Alice");
        people[1] = new Person("Bob");
        people[2] = new Person("Charlie");
        Broker broker = new Broker(clients, people);
        broker.display();
		
		  String[] equipment = new String[3];
        equipment[0] = "Claw Hammer";
        equipment[1] = "Mallet";
        equipment[2] = "Tack Hammer";

        Surface[] surfaces = new Surface[3];
        surfaces[0] = new Surface("Wooden Plank");
        surfaces[1] = new Surface("Steel Sheet");
        surfaces[2] = new Surface("Concrete Block");

        Hammer hammer = new Hammer(equipment, surfaces);
        hammer.display();
		
		 String[] flavors = new String[3];
        flavors[0] = "Plain";
        flavors[1] = "Kesar";
        flavors[2] = "Chocolate";

        Ingredient[] ingredients = new Ingredient[3];
        ingredients[0] = new Ingredient("Milk");
        ingredients[1] = new Ingredient("Sugar");
        ingredients[2] = new Ingredient("Flour");

        Jamoon jamoon = new Jamoon(flavors, ingredients);
        jamoon.display();
		  String[] messages = new String[3];
        messages[0] = "Welcome";
        messages[1] = "Sale Today";
        messages[2] = "Happy Holidays";

        Location[] locations = new Location[3];
        locations[0] = new Location("Main Gate");
        locations[1] = new Location("Lobby");
        locations[2] = new Location("Conference Hall");

        Banner banner = new Banner(messages, locations);
        banner.display();
		
        String[] towerNames = new String[3];
        towerNames[0] = "Alpha Tower";
        towerNames[1] = "Beta Tower";
        towerNames[2] = "Gamma Tower";

        TowerSection[] towers = new TowerSection[3];
        towers[0] = new TowerSection("Ground Section");
        towers[1] = new TowerSection("Middle Section");
        towers[2] = new TowerSection("Top Section");

        Tower tower = new Tower(towerNames, towers);
        tower.display();

		
		
    }
}
	

		