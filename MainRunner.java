class MainRunner{
	
	public static void main(String... args)
	{
		
		Brand brand = new Brand();
		Quality quality = new Quality();
		Warranty warranty = new Warranty();
		Price price = new Price();
		Mousepad mousepad = new Mousepad();
		
		Mouse mouse = new Mouse("dell",0.4f,3,true,"good",brand,quality,warranty,price,mousepad);
		System.out.println("Executing mouse runner");
		
		Folder folder = new Folder();
		Owner owner = new Owner();
		Permission permission=new Permission();
		Metadata metadata=new Metadata();
		Storagedevice storagedevice=new Storagedevice();
		
		File file =new File("java",10,"c drive",true,2,folder,owner,permission,metadata,storagedevice);
		System.out.println("Executing file runner");
		
		  Habitat habitat = new Habitat();
        Food food = new Food();
        Zoo zoo = new Zoo();
        Caretaker caretaker = new Caretaker();
        HealthRecord healthRecord = new HealthRecord();

        Lion lion = new Lion("Simha", 10, 50.0, true, 'A',
                habitat, food, zoo, caretaker, healthRecord);

        System.out.println("Executing Lion runner");
		
		 Battery battery = new Battery();
        Engine engine = new Engine();
        Company company = new Company();
        Driver driver = new Driver();

		  Motor motor = new Motor(120, 75000.50, 45.5f, 'A', false, "Honda",
                                new Battery(), new Engine(), new Company(), new Driver());

        System.out.println("Motor executing");
		
		Name name=new Name();
		Team team = new Team();
        Stadium stadium = new Stadium();
        Country country = new Country();
        Assistant assistant = new Assistant();

        Coach coach = new Coach(12,45000.5,4.3f,'A',true,name,
                                team,stadium,country,assistant);

        System.out.println("Coach executing");
		
		 Teams teams = new Teams();
        Stadiums stadiums = new Stadiums();
        Player player = new Player();
        Coachh  coach = new Coachh();
        Umpire umpire = new Umpire();

        IPL ipl = new IPL(17,12000.50,4.7f,'A',true,
                          teams,stadiums,player,coach,umpire);

        System.out.println("IPL object created");
		
		 Therapist therapist = new Therapist();
        Customer customer = new Customer();
        Manager manager = new Manager();
        Location location = new Location();
        Service service = new Service();

        Spa spa = new Spa(10,2500.50,4.5f,'A',true,
                          therapist,customer,manager,location,service);

        System.out.println("Spa executing");
		
		 Leaf leaf = new Leaf();
        Water water = new Water();
        Sugar sugar = new Sugar();
        Milk milk = new Milk();
        Kettle kettle = new Kettle();

        Tea tea = new Tea(5,20.5,75.5f,'M',true,
                          leaf,water,sugar,milk,kettle);

        System.out.println("Tea executing");
		
		 Metal metal = new Metal();
        Sound sound = new Sound();
        Rope rope = new Rope();
        Temple temple = new Temple();
        Manufacturer manufacturer = new Manufacturer();

        Bell bell = new Bell(10,500.5,2.5f,'A',false,
                             metal,sound,rope,temple,manufacturer);

        System.out.println("Bell executing");
		
		 Server server = new Server();
        Database database = new Database();
        Network network = new Network();
        Storage storage = new Storage();
        Firewall firewall = new Firewall();

        CloudWeb cloudWeb = new CloudWeb(10,500.5,12.5f,'A',true,
                                         server,database,network,storage,firewall);

        System.out.println("CloudWeb executing");
		
		Fish fish = new Fish();
        WaterFilter filter = new WaterFilter();
        Plant plant = new Plant();
        Heater heater = new Heater();
        Glass glass = new Glass();

        Aquarium aquarium = new Aquarium(50,3000.50,40.5f,'A',true,
                                         fish,filter,plant,heater,glass);

        System.out.println("Aquarium executing");
    }
}
		
		
		

		
	
