//Declare below classes, then declare least 20 instance variables in every class . One constrcutor in each class,then instance method to display all the variables. Then in the runner create least 10 instances and invoke the method to display Google,WallPaper,Pepper,Paper,Garlic,Stand,Map,Toxic,PVR,Trophy, DumbBell,Diabetes,Brain,Shampoo,Conditioner,Organ,Cell,Office,Lotion,Organizer,Education

class Google{
	
	
    String companyName;
    int foundingYear;
    String founder;
    String ceo;
    String headquarters;
    int employeeCount;
    double revenue;
    double marketCap;
    String parentCompany;
    String stockSymbol;
    String primarySearchEngine;
    String cloudPlatform;
    String emailService;
    String videoPlatform;
    String mobileOS;
    String browser;
    String aiDivision;
    String hardwareProducts;
    String advertisingPlatform;
    String motto;

  
     Google(String companyName, int foundingYear, String founder, String ceo, String headquarters,
                  int employeeCount, double revenue, double marketCap, String parentCompany, String stockSymbol,
                  String primarySearchEngine, String cloudPlatform, String emailService, String videoPlatform,
                  String mobileOS, String browser, String aiDivision, String hardwareProducts,
                  String advertisingPlatform, String motto) {
        this.companyName = companyName;
        this.foundingYear = foundingYear;
        this.founder = founder;
        this.ceo = ceo;
        this.headquarters = headquarters;
        this.employeeCount = employeeCount;
        this.revenue = revenue;
        this.marketCap = marketCap;
        this.parentCompany = parentCompany;
        this.stockSymbol = stockSymbol;
        this.primarySearchEngine = primarySearchEngine;
        this.cloudPlatform = cloudPlatform;
        this.emailService = emailService;
        this.videoPlatform = videoPlatform;
        this.mobileOS = mobileOS;
        this.browser = browser;
        this.aiDivision = aiDivision;
        this.hardwareProducts = hardwareProducts;
        this.advertisingPlatform = advertisingPlatform;
        this.motto = motto;
    }
     
	 
	 
	void show()
	{
		System.out.println("Running google:");
		 System.out.println("Company Name: " + companyName);
        System.out.println("Founding Year: " + foundingYear);
        System.out.println("Founder: " + founder);
        System.out.println("CEO: " + ceo);
        System.out.println("Headquarters: " + headquarters);
        System.out.println("Employee Count: " + employeeCount);
        System.out.println("Revenue: " + revenue + " billion");
        System.out.println("Market Cap: " + marketCap + " billion");
        System.out.println("Parent Company: " + parentCompany);
        System.out.println("Stock Symbol: " + stockSymbol);
        System.out.println("Primary Search Engine: " + primarySearchEngine);
        System.out.println("Cloud Platform: " + cloudPlatform);
        System.out.println("Email Service: " + emailService);
        System.out.println("Video Platform: " + videoPlatform);
        System.out.println("Mobile OS: " + mobileOS);
        System.out.println("Browser: " + browser);
        System.out.println("AI Division: " + aiDivision);
        System.out.println("Hardware Products: " + hardwareProducts);
        System.out.println("Advertising Platform: " + advertisingPlatform);
        System.out.println("Motto: " + motto);
		 System.out.println();
		 
	
	}
}
