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
Product p72 = new Product("Microwave Oven","IFB","2023",15000,ProductType.Kitchen_Appliance,"Electronics Shop",WarrantyYears.Two_Years,false,"72","India");
Product p73 = new Product("Rice","India Gate","2024",950,ProductType.Groceries,"Supermarket",WarrantyYears.One_Year,false,"73","India");
Product p74 = new Product("Air Conditioner","Voltas","2023",35000,ProductType.Appliance,"Store",WarrantyYears.Three_years,false,"74","India");
Product p75 = new Product("Laptop","HP","2024",55000,ProductType.Electronics,"Online",WarrantyYears.Two_Years,false,"75","India");
Product p76 = new Product("Chair","Wooden","2022",2500,ProductType.Furniture,"Furniture Shop",WarrantyYears.Two_Years,false,"76","India");
Product p77 = new Product("Juicer","Philips","2023",4500,ProductType.Kitchen_Appliance,"Electronics Shop",WarrantyYears.Two_Years,false,"77","India");
Product p78 = new Product("Biscuit","ParleG","2024",30,ProductType.Food,"Local Shop",WarrantyYears.One_Year,false,"78","India");
Product p79 = new Product("Smartphone","Samsung","2024",28000,ProductType.Electronics,"Online",WarrantyYears.Two_Years,false,"79","India");
Product p80 = new Product("Wardrobe","Godrej","2023",18000,ProductType.Furniture,"Furniture Shop",WarrantyYears.Three_years,false,"80","India");

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
    }
}