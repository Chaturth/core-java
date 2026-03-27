public class ProductRunner {

    public static void main(String[] args) {

        Product[] products = new Product[137];
        ProductStore store = new ProductStore(products);

        Product p1 = new Product("Rice Bag","India Gate","2024",1200,ProductType.Groceries,"Reliance Store",WarrantyYears.One_Year,false,"1","India");
        Product p2 = new Product("Milk Packet","Nandini","2024",50,ProductType.Food,"Local Shop",WarrantyYears.One_Year,false,"2","India");
        Product p3 = new Product("Dining Table","Ikea","2022",18000,ProductType.Furniture,"Ikea Store",WarrantyYears.Three_years,false,"3","Inida");
        Product p4 = new Product("LED TV","Sony","2023",55000,ProductType.TV,"Croma",WarrantyYears.Two_Years,false,"4","Japan");
        Product p5 = new Product("Refrigerator","LG","2023",42000,ProductType.Fridge,"Reliance Digital",WarrantyYears.Four_years,false,"5","South Korea");
        Product p6 = new Product("Wheat Flour","Aashirvaad","2024",600,ProductType.Groceries,"Big Bazaar",WarrantyYears.One_Year,false,"6","India");
        Product p7 = new Product("Biscuits","Britannia","2024",30,ProductType.Food,"Local Store",WarrantyYears.One_Year,false,"7","India");
        Product p8 = new Product("Office Chair","Featherlite","2022",7500,ProductType.Furniture,"Featherlite Showroom",WarrantyYears.Two_Years,false,"8","India");
        Product p9 = new Product("Smart TV","Samsung","2024",65000,ProductType.TV,"Flipkart",WarrantyYears.Two_Years,false,"9","South Korea");
        Product p10 = new Product("Double Door Fridge","Whirlpool","2023",38000,ProductType.Fridge,"Amazon",WarrantyYears.Four_years,false,"10","USA");
        Product p11 = new Product("Sugar","Uttam","2024",45,ProductType.Groceries,"Local Market",WarrantyYears.One_Year,false,"11","India");
        Product p12 = new Product("Chocolate","Cadbury","2024",100,ProductType.Food,"Supermarket",WarrantyYears.One_Year,false,"12","UK");
        Product p13 = new Product("Wooden Bed","Urban Ladder","2022",25000,ProductType.Furniture,"Urban Ladder",WarrantyYears.Three_years,false,"13","India");
        Product p14 = new Product("Android TV","OnePlus","2024",48000,ProductType.TV,"Amazon",WarrantyYears.Two_Years,false,"14","China");
        Product p15 = new Product("Mini Fridge","Godrej","2023",15000,ProductType.Fridge,"Reliance Digital",WarrantyYears.Three_years,false,"15","India");
        Product p16 = new Product("Dal","Tata Sampann","2024",120,ProductType.Groceries,"BigBasket",WarrantyYears.One_Year,false,"16","India");
        Product p17 = new Product("Ice Cream","Amul","2024",200,ProductType.Food,"Local Store",WarrantyYears.One_Year,false,"17","India");
        Product p18 = new Product("Study Table","Nilkamal","2022",5000,ProductType.Furniture,"Nilkamal Store",WarrantyYears.Two_Years,false,"18","India");
        Product p19 = new Product("OLED TV","LG","2024",120000,ProductType.TV,"Croma",WarrantyYears.Two_Years,false,"19","South Korea");
        Product p20 = new Product("Single Door Fridge","Haier","2023",20000,ProductType.Fridge,"Flipkart",WarrantyYears.Three_years,false,"20","China");
		Product p21 = new Product("Rice","Local Brand","2024",800,ProductType.Groceries,"Local Shop",WarrantyYears.One_Year,false,"21","India");
Product p22 = new Product("Milk","Nandini","2024",50,ProductType.Food,"Milk Booth",WarrantyYears.One_Year,false,"22","India");
Product p23 = new Product("Chair","Local","2023",1000,ProductType.Furniture,"Furniture Shop",WarrantyYears.Two_Years,false,"23","India");
Product p24 = new Product("TV","LG","2023",40000,ProductType.TV,"Electronics Shop",WarrantyYears.Two_Years,false,"24","India");
Product p25 = new Product("Fridge","Samsung","2023",30000,ProductType.Fridge,"Electronics Store",WarrantyYears.Three_years,false,"25","India");
Product p26 = new Product("Sugar","Local","2024",45,ProductType.Groceries,"Local Market",WarrantyYears.One_Year,false,"26","India");
Product p27 = new Product("Biscuits","Good Day","2024",30,ProductType.Food,"Shop",WarrantyYears.One_Year,false,"27","India");
Product p28 = new Product("Table","Wooden","2022",5000,ProductType.Furniture,"Furniture Shop",WarrantyYears.Two_Years,false,"28","India");
Product p29 = new Product("Smart TV","Sony","2024",60000,ProductType.TV,"Croma",WarrantyYears.Two_Years,false,"29","India");
Product p30 = new Product("Refrigerator","LG","2023",35000,ProductType.Fridge,"Reliance Store",WarrantyYears.Three_years,false,"30","India");
Product p31 = new Product("Wheat Flour","Local","2024",600,ProductType.Groceries,"Shop",WarrantyYears.One_Year,false,"31","India");
Product p32 = new Product("Chocolate","Dairy Milk","2024",100,ProductType.Food,"Bakery",WarrantyYears.One_Year,false,"32","India");
Product p33 = new Product("Bed","Wooden","2022",15000,ProductType.Furniture,"Furniture Shop",WarrantyYears.Three_years,false,"33","India");
Product p34 = new Product("LED TV","Samsung","2024",55000,ProductType.TV,"Electronics Shop",WarrantyYears.Two_Years,false,"34","India");
Product p35 = new Product("Mini Fridge","Godrej","2023",15000,ProductType.Fridge,"Store",WarrantyYears.Three_years,false,"35","India");
Product p36 = new Product("Salt","Tata","2024",25,ProductType.Groceries,"Local Shop",WarrantyYears.One_Year,false,"36","India");
Product p37 = new Product("Ice Cream","Amul","2024",200,ProductType.Food,"Ice Cream Shop",WarrantyYears.One_Year,false,"37","India");
Product p38 = new Product("Plastic Chair","Local","2022",500,ProductType.Furniture,"Shop",WarrantyYears.Two_Years,false,"38","India");
Product p39 = new Product("TV","OnePlus","2024",45000,ProductType.TV,"Online",WarrantyYears.Two_Years,false,"39","India");
Product p40 = new Product("Single Door Fridge","LG","2023",20000,ProductType.Fridge,"Store",WarrantyYears.Three_years,false,"40","India");
Product p41 = new Product("Oil","Sunflower","2024",180,ProductType.Groceries,"Local Shop",WarrantyYears.One_Year,false,"41","India");
Product p42 = new Product("Curd","Nandini","2024",40,ProductType.Food,"Milk Booth",WarrantyYears.One_Year,false,"42","India");
Product p43 = new Product("Stool","Plastic","2023",300,ProductType.Furniture,"Furniture Shop",WarrantyYears.Two_Years,false,"43","India");
Product p44 = new Product("LED TV","Sony","2023",50000,ProductType.TV,"Electronics Shop",WarrantyYears.Two_Years,false,"44","India");
Product p45 = new Product("Fridge","Godrej","2023",25000,ProductType.Fridge,"Store",WarrantyYears.Three_years,false,"45","India");
Product p46 = new Product("Dal"," Dal","2024",120,ProductType.Groceries,"Market",WarrantyYears.One_Year,false,"46","India");
Product p47 = new Product("Bread","Local","2024",35,ProductType.Food,"Bakery",WarrantyYears.One_Year,false,"47","India");
Product p48 = new Product("Table","Plastic","2022",2000,ProductType.Furniture,"Shop",WarrantyYears.Two_Years,false,"48","India");
Product p49 = new Product("Smart TV","LG","2024",55000,ProductType.TV,"Croma",WarrantyYears.Two_Years,false,"49","India");
Product p50 = new Product("Refrigerator","Whirlpool","2023",30000,ProductType.Fridge,"Reliance Store",WarrantyYears.Three_years,false,"50","India");
Product p51 = new Product("Rava","Local","2024",60,ProductType.Groceries,"Local Shop",WarrantyYears.One_Year,false,"51","India");
Product p52 = new Product("Juice","Real","2024",90,ProductType.Food,"Supermarket",WarrantyYears.One_Year,false,"52","India");
Product p53 = new Product("Bed","Steel","2022",10000,ProductType.Furniture,"Furniture Shop",WarrantyYears.Three_years,false,"53","India");
Product p54 = new Product("Android TV","Mi","2024",35000,ProductType.TV,"Online",WarrantyYears.Two_Years,false,"54","India");
Product p55 = new Product("Mini Fridge","Haier","2023",18000,ProductType.Fridge,"Store",WarrantyYears.Three_years,false,"55","India");
Product p56 = new Product("Tea Powder","Tata","2024",250,ProductType.Groceries,"Local Shop",WarrantyYears.One_Year,false,"56","India");
Product p57 = new Product("Cake","Bakery","2024",300,ProductType.Food,"Bakery",WarrantyYears.One_Year,false,"57","India");
Product p58 = new Product("Chair","Steel","2022",1200,ProductType.Furniture,"Shop",WarrantyYears.Two_Years,false,"58","India");
Product p59 = new Product("TV","Panasonic","2024",42000,ProductType.TV,"Electronics Store",WarrantyYears.Two_Years,false,"59","India");
Product p60 = new Product("Double Door Fridge","Samsung","2023",38000,ProductType.Fridge,"Store",WarrantyYears.Three_years,false,"60","India");
Product p61 = new Product("Soap","Lux","2024",40,ProductType.Groceries,"Local Shop",WarrantyYears.One_Year,false,"61","India");
Product p62 = new Product("Shampoo","Clinic Plus","2024",120,ProductType.Food,"Supermarket",WarrantyYears.One_Year,false,"62","India");
Product p63 = new Product("Bucket","Plastic","2023",200,ProductType.Furniture,"Shop",WarrantyYears.Two_Years,false,"63","India");
Product p64 = new Product("LED TV","Vu","2023",30000,ProductType.TV,"Electronics Shop",WarrantyYears.Two_Years,false,"64","India");
Product p65 = new Product("Fridge","LG","2023",28000,ProductType.Fridge,"Store",WarrantyYears.Three_years,false,"65","India");
Product p66 = new Product("Toothpaste","Colgate","2024",90,ProductType.Groceries,"Medical Store",WarrantyYears.One_Year,false,"66","India");
Product p67 = new Product("Snacks","Lays","2024",20,ProductType.Food,"Local Shop",WarrantyYears.One_Year,false,"67","India");
Product p68 = new Product("Shelf","Wooden","2022",3500,ProductType.Furniture,"Furniture Shop",WarrantyYears.Two_Years,false,"68","India");
Product p69 = new Product("Smart TV","Realme","2024",32000,ProductType.TV,"Online",WarrantyYears.Two_Years,false,"69","India");
Product p70 = new Product("Mini Fridge","Godrej","2023",16000,ProductType.Fridge,"Store",WarrantyYears.Three_years,false,"70","India");
Product p71 = new Product("Dining Table","Nilkamal","2022",12000,ProductType.Furniture,"Furniture Shop",WarrantyYears.Two_Years,false,"71","India");
Product p72 = new Product("Microwave Oven","IFB","2023",15000,ProductType.TV,"Electronics Shop",WarrantyYears.Two_Years,false,"72","India");
Product p73 = new Product("Rice","India Gate","2024",950,ProductType.Groceries,"Supermarket",WarrantyYears.One_Year,false,"73","India");
Product p74 = new Product("Air Conditioner","Voltas","2023",35000,ProductType.TV,"Store",WarrantyYears.Three_years,false,"74","India");
Product p75 = new Product("Laptop","HP","2024",55000,ProductType.Fridge,"Online",WarrantyYears.Two_Years,false,"75","India");
Product p76 = new Product("Chair","Wooden","2022",2500,ProductType.Furniture,"Furniture Shop",WarrantyYears.Two_Years,false,"76","India");
Product p77 = new Product("Juicer","Philips","2023",4500,ProductType.TV,"Electronics Shop",WarrantyYears.Two_Years,false,"77","India");
Product p78 = new Product("Biscuit","ParleG","2024",30,ProductType.Food,"Local Shop",WarrantyYears.One_Year,false,"78","India");
Product p79 = new Product("Smartphone","Samsung","2024",28000,ProductType.TV,"Online",WarrantyYears.Two_Years,false,"79","India");
Product p80 = new Product("Wardrobe","Godrej","2023",18000,ProductType.Furniture,"Furniture Shop",WarrantyYears.Three_years,false,"80","India");
Product p81 = new Product("Table","Wood","2022",5000,ProductType.Furniture,"Furniture Shop",WarrantyYears.Two_Years,false,"81","India");
Product p82 = new Product("Washing Machine","LG","2023",27000,ProductType.TV,"Electronics Store",WarrantyYears.Three_years,false,"82","India");
Product p83 = new Product("Fan","Usha","2024",2200,ProductType.Furniture,"Local Shop",WarrantyYears.Two_Years,false,"83","India");
Product p84 = new Product("Milk","Nandini","2024",50,ProductType.Groceries,"Dairy Shop",WarrantyYears.One_Year,false,"84","India");
Product p85 = new Product("AC","Blue Star","2023",40000,ProductType.TV,"Electronics Store",WarrantyYears.Three_years,false,"85","India");
Product p86 = new Product("Notebook","Classmate","2024",80,ProductType.Groceries,"Stationery Shop",WarrantyYears.One_Year,false,"86","India");
Product p87 = new Product("Pen","Reynolds","2024",10,ProductType.Groceries,"Stationery Shop",WarrantyYears.One_Year,false,"87","India");
Product p88 = new Product("Bed","Wooden","2022",20000,ProductType.Furniture,"Furniture Shop",WarrantyYears.Three_years,false,"88","India");
Product p89 = new Product("Mixer Grinder","Prestige","2023",6000,ProductType.TV,"Electronics Shop",WarrantyYears.Two_Years,false,"89","India");
Product p90 = new Product("Eggs","Local","2024",120,ProductType.Food,"Market",WarrantyYears.One_Year,false,"90","India");
Product p91 = new Product("Sofa","Nilkamal","2022",25000,ProductType.Furniture,"Furniture Shop",WarrantyYears.Three_years,false,"91","India");
Product p92 = new Product("Heater","Bajaj","2023",3000,ProductType.TV,"Electronics Store",WarrantyYears.Two_Years,false,"92","India");
Product p93 = new Product("Water Bottle","Milton","2024",300,ProductType.Furniture,"Shop",WarrantyYears.One_Year,false,"93","India");
Product p94 = new Product("Bread","Britannia","2024",40,ProductType.Food,"Bakery",WarrantyYears.One_Year,false,"94","India");
Product p95 = new Product("Iron Box","Philips","2023",1800,ProductType.TV,"Electronics Shop",WarrantyYears.Two_Years,false,"95","India");
Product p96 = new Product("Cupboard","Godrej","2022",22000,ProductType.Furniture,"Furniture Shop",WarrantyYears.Three_years,false,"96","India");
Product p97 = new Product("Mobile","OnePlus","2024",35000,ProductType.TV,"Online",WarrantyYears.Two_Years,false,"97","India");
Product p98 = new Product("Sugar","Madhur","2024",60,ProductType.Groceries,"Supermarket",WarrantyYears.One_Year,false,"98","India");
Product p99 = new Product("Tea Powder","Tata Tea","2024",250,ProductType.Groceries,"Supermarket",WarrantyYears.One_Year,false,"99","India");
Product p100 = new Product("Cooler","Symphony","2023",9000,ProductType.TV,"Store",WarrantyYears.Two_Years,false,"100","India");
Product p101 = new Product("Dining Chair","Plastic","2022",800,ProductType.Furniture,"Shop",WarrantyYears.Two_Years,false,"101","India");
Product p102 = new Product("Camera","Canon","2023",45000,ProductType.TV,"Electronics Store",WarrantyYears.Two_Years,false,"102","India");
Product p103 = new Product("Biscuits","Good Day","2024",25,ProductType.Food,"Local Shop",WarrantyYears.One_Year,false,"103","India");
Product p104 = new Product("Curtains","Cotton","2022",1500,ProductType.Furniture,"Home Store",WarrantyYears.Two_Years,false,"104","India");
Product p105 = new Product("Projector","Epson","2023",55000,ProductType.TV,"Electronics Store",WarrantyYears.Three_years,false,"105","India");
Product p106 = new Product("Detergent","Surf Excel","2024",220,ProductType.Groceries,"Supermarket",WarrantyYears.One_Year,false,"106","India");
Product p107 = new Product("Stove","Prestige","2023",3500,ProductType.TV,"Kitchen Store",WarrantyYears.Two_Years,false,"107","India");
Product p108 = new Product("Carpet","Wool","2022",7000,ProductType.Furniture,"Home Store",WarrantyYears.Three_years,false,"108","India");
Product p109 = new Product("Chocolates","Cadbury","2024",150,ProductType.Food,"Shop",WarrantyYears.One_Year,false,"109","India");
Product p110 = new Product("Tablet","Lenovo","2024",20000,ProductType.TV,"Online",WarrantyYears.Two_Years,false,"110","India");
Product p111 = new Product("Keyboard","Logitech","2024",1200,ProductType.TV,"Electronics Store",WarrantyYears.Two_Years,false,"111","India");
Product p112 = new Product("Mouse","HP","2024",800,ProductType.TV,"Electronics Store",WarrantyYears.Two_Years,false,"112","India");
Product p113 = new Product("Monitor","Dell","2023",15000,ProductType.TV,"Electronics Store",WarrantyYears.Three_years,false,"113","India");
Product p114 = new Product("Printer","Canon","2023",9000,ProductType.TV,"Electronics Store",WarrantyYears.Two_Years,false,"114","India");
Product p115 = new Product("Router","TP-Link","2024",2500,ProductType.TV,"Electronics Shop",WarrantyYears.Two_Years,false,"115","India");
Product p116 = new Product("Hard Disk","Seagate","2023",6000,ProductType.TV,"Electronics Shop",WarrantyYears.Two_Years,false,"116","India");
Product p117 = new Product("Pendrive","SanDisk","2024",700,ProductType.TV,"Electronics Shop",WarrantyYears.One_Year,false,"117","India");
Product p118 = new Product("Speakers","JBL","2023",5000,ProductType.TV,"Electronics Shop",WarrantyYears.Two_Years,false,"118","India");
Product p119 = new Product("Headphones","Sony","2024",3000,ProductType.TV,"Electronics Store",WarrantyYears.Two_Years,false,"119","India");
Product p120 = new Product("Charger","Mi","2024",500,ProductType.TV,"Mobile Shop",WarrantyYears.One_Year,false,"120","India");
Product p121 = new Product("Power Bank","Ambrane","2024",1500,ProductType.TV,"Mobile Shop",WarrantyYears.One_Year,false,"121","India");
Product p122 = new Product("Extension Board","Havells","2023",1200,ProductType.TV,"Electronics Shop",WarrantyYears.Two_Years,false,"122","India");
Product p123 = new Product("Tube Light","Philips","2023",600,ProductType.Furniture,"Electrical Shop",WarrantyYears.Two_Years,false,"123","India");
Product p124 = new Product("Switch","Anchor","2023",200,ProductType.Furniture,"Electrical Shop",WarrantyYears.One_Year,false,"124","India");
Product p125 = new Product("Rice Cooker","Prestige","2023",3500,ProductType.TV,"Kitchen Store",WarrantyYears.Two_Years,false,"125","India");
Product p126 = new Product("Gas Stove","Butterfly","2023",4000,ProductType.TV,"Kitchen Store",WarrantyYears.Two_Years,false,"126","India");
Product p127 = new Product("Pressure Cooker","Hawkins","2023",2500,ProductType.TV,"Kitchen Store",WarrantyYears.Two_Years,false,"127","India");
Product p128 = new Product("Plate Set","Steel","2022",1200,ProductType.Furniture,"Utensils Shop",WarrantyYears.One_Year,false,"128","India");
Product p129 = new Product("Glass Set","Borosil","2022",900,ProductType.Furniture,"Utensils Shop",WarrantyYears.One_Year,false,"129","India");
Product p130 = new Product("Water Purifier","Kent","2023",18000,ProductType.TV,"Electronics Store",WarrantyYears.Three_years,false,"130","India");
Product p131 = new Product("Ceiling Fan","Orient","2023",3000,ProductType.Furniture,"Electrical Shop",WarrantyYears.Two_Years,false,"131","India");
Product p132 = new Product("Wall Clock","Ajanta","2022",700,ProductType.Furniture,"Home Store",WarrantyYears.One_Year,false,"132","India");
Product p133 = new Product("Bag","Skybags","2024",2000,ProductType.Furniture,"Store",WarrantyYears.One_Year,false,"133","India");
Product p134 = new Product("Shoes","Nike","2024",4500,ProductType.Furniture,"Footwear Shop",WarrantyYears.One_Year,false,"134","India");
Product p135 = new Product("T-shirt","Puma","2024",1200,ProductType.Furniture,"Clothing Store",WarrantyYears.One_Year,false,"135","India");
Product p136 = new Product("Jeans","Levis","2024",2500,ProductType.Furniture,"Clothing Store",WarrantyYears.One_Year,false,"136","India");
Product p137 = new Product("Jacket","Woodland","2024",5000,ProductType.Furniture,"Clothing Store",WarrantyYears.One_Year,false,"137","India");

        store.save(p1);
        store.save(p2);
        store.save(p3);
        store.save(p10);
        store.save(p15);
        store.save(p20);
        store.save(p17);
        store.save(p18);
        store.save(p70);
        store.save(p20);
		 store.save(p65);
        store.save(p80);
        store.save(p40);

        store.displayAllProducts();
    	
        store.searchByUniqueId("10");
		
		store.searchByUniqueId("1");
		
        store.searchByUniqueIdAndName("20","Single Door Fridge");
		
        store.searchByUniqueIdAndNameAndOriginCountry("2","Laptop","India");
		
        store.getAllOriginCountry();
		
        store.warraentyExpiredByUniqueId("5");
		
        store.getAllByType(ProductType.TV);
		
        store.getAllByWarrantyYears(WarrantyYears.One_Year);
		
		Product[] multipleProducts={p5,p15,p25,p35,p44,p77,p64,p43,p23,p32};
		store.save(multipleProducts);
		
		    store.displayAllProducts();
    }
}