class MainRunner{
	
	public static void main(String... args)
	{
		
		
        Brand brand = new Brand("Dell");
        Quality quality = new Quality(5);
        Warranty warranty = new Warranty(365);
        Price price = new Price(1200);
        Mousepad mousepad = new Mousepad();

        Mouse mouse = new Mouse("Dell", 0.4f, 3, true, "Good",
                brand, quality, warranty, price, mousepad);

        System.out.println("Executing Mouse Runner");
        mouse.getInfo();
		
		 Folder folder = new Folder("Projects");
        Owner owner = new Owner("Chaturth");
        Permission permission = new Permission(true);
        Metadata metadata = new Metadata("JavaFile");
        Storagedevice storagedevice = new Storagedevice(500);

        File file = new File("java",10,"c drive",true,2,folder,owner,permission,metadata,storagedevice);

        System.out.println("Executing File Runner");
        file.getInfo();
		
		   Habitat habitat = new Habitat("Forest");
        Food food = new Food("Meat");
        Zoo zoo = new Zoo("Mysore Zoo");
        Caretaker caretaker = new Caretaker("Ramesh");
        HealthRecord healthRecord = new HealthRecord("Healthy");

        Lion lion = new Lion("Simba",5,190.5,true,'A',
                             habitat,food,zoo,caretaker,healthRecord);

        System.out.println("Executing Lion Runner");

        lion.getInfo();
		
	   Battery battery = new Battery(5000);
        Engine engine = new Engine(150);
        Company company = new Company("Tesla");
        Driver driver = new Driver("Arjun");

        Motor motor = new Motor(180,2500000,25.5f,'A',true,"Tesla",
                                battery,engine,company,driver);

        System.out.println("Executing Motor Runner");

        motor.getInfo();
		
	 Name name = new Name("John");
        Team team = new Team("India");
        Stadium stadium = new Stadium("Chinnaswamy");
        Country country = new Country("India");
        Assistant assistant = new Assistant("Rahul");

        Coach coach = new Coach(10,500000,4.5f,'A',true,
                                name,team,stadium,country,assistant);

        System.out.println("Executing Coach Runner");

        coach.getInfo();
		
		 

          Teams teams = new Teams("RCB");
        Stadiums stadiums = new Stadiums("Chinnaswamy");
        Player player = new Player("Virat");
       Coachh coachh = new Coachh("Andy Flower");
        Umpire umpire = new Umpire("Kumar");

      IPL ipl = new IPL(17,12000.5,4.8f,'A',true,
                  teams,stadiums,player,coachh,umpire);

        System.out.println("Executing IPL Runner");

        ipl.getInfo();


		
		   Leaf leaf = new Leaf("Assam");
        Water water = new Water(200);
        Sugar sugar = new Sugar(2);
        Milk milk = new Milk(100);
        Kettle kettle = new Kettle("Prestige");

        Tea tea = new Tea(2,20.0,85.5f,'M',true,
                          leaf,water,sugar,milk,kettle);

        System.out.println("Executing Tea Runner");

        tea.getInfo();
		
		 Metal metal = new Metal("Bronze");
        Sound sound = new Sound("Loud");
        Rope rope = new Rope("Cotton");
        Temple temple = new Temple("Tirupati");
        Manufacturer manufacturer = new Manufacturer("TempleCraft");

        Bell bell = new Bell(5,1500.0,2.5f,'A',false,
                             metal,sound,rope,temple,manufacturer);

        System.out.println("Executing Bell Runner");

        bell.getInfo();
		
		 Server server = new Server("AWS-Server");
        Database database = new Database("MySQL");
        Network network = new Network("VPC");
        Storage storage = new Storage(1000);
        Firewall firewall = new Firewall("SecureWall");

        Cloud cloud = new Cloud(10,1000.5,2.3f,'A',true,
                                server,database,network,storage,firewall);

        System.out.println("Executing Cloud Runner");

        cloud.getInfo();
		
	 Fish fish = new Fish("Goldfish");
        WaterFilter filter = new WaterFilter("Carbon");
        Plant plant = new Plant("Water Lily");
        Heater heater = new Heater(26);
        Glass glass = new Glass("Tempered");

        Aquarium aquarium = new Aquarium(50,5000.0,30.5f,'A',true,
                                         fish,filter,plant,heater,glass);

        System.out.println("Executing Aquarium Runner");

        aquarium.getInfo();
		
		 Therapist therapist = new Therapist("Anita");
        Customer customer = new Customer("Rahul");
        Manager manager = new Manager("Suresh");
        Location location = new Location("Bangalore");
        Service service = new Service("Massage");

        Spa spa = new Spa(5,2500.0,4.5f,'A',true,
                          therapist,customer,manager,location,service);

        System.out.println("Executing Spa Runner");

        spa.getInfo();
    }
}
		
		
		

		
	
