class CapRunner {

    public static void main(String[] args) {

        Cap[] caps = new Cap[10];
        CapStore capstore = new CapStore(caps);

        capstore.save(new Cap("Black", "Nike", 999, "M", "Cotton", true));
        capstore.save(new Cap("White", "Adidas", 899, "L", "Polyester", true));
        capstore.save(new Cap("Red", "Puma", 799, "S", "Cotton", false));
        capstore.save(new Cap("Blue", "Reebok", 850, "M", "Wool", true));
        capstore.save(new Cap("Green", "Fila", 650, "L", "Cotton", false));
        capstore.save(new Cap("Grey", "Under Armour", 1200, "M", "Polyester", true));
        capstore.save(new Cap("Brown", "Levis", 700, "S", "Denim", false));
        capstore.save(new Cap("Yellow", "Zara", 1100, "L", "Cotton", true));
        capstore.save(new Cap("Pink", "H&M", 500, "M", "Polyester", true));
        capstore.save(new Cap("Black", "Gucci", 5000, "L", "Silk", false));
		
		
		System.out.println("-----");
		
		

        Maps[] mapsArray = new Maps[10];
        MapsStore store = new MapsStore(mapsArray);

        store.save(new Maps("India", 100.5, 80.2, "1:50000", "English", "Asia"));
        store.save(new Maps("USA", 120.0, 90.5, "1:100000", "English", "North America"));
        store.save(new Maps("Australia", 95.0, 70.0, "1:75000", "English", "Australia"));
        store.save(new Maps("Canada", 130.0, 100.0, "1:200000", "English", "North America"));
        store.save(new Maps("Brazil", 110.0, 85.0, "1:150000", "Portuguese", "South America"));
        store.save(new Maps("UK", 80.0, 60.0, "1:50000", "English", "Europe"));
        store.save(new Maps("Germany", 85.0, 65.0, "1:60000", "German", "Europe"));
        store.save(new Maps("Japan", 70.0, 50.0, "1:40000", "Japanese", "Asia"));
        store.save(new Maps("China", 140.0, 110.0, "1:250000", "Chinese", "Asia"));
        store.save(new Maps("Russia", 160.0, 120.0, "1:300000", "Russian", "Europe/Asia"));
		
		
		System.out.println("--------");
	

        Cloth[] cloth= new Cloth[10];
        ClothStore cloth = new ClothStore(cloth);

        cloth.save(new Cloth("Shirt", "Nike", 999, "M", "Black", "Cotton"));
        cloth.save(new Cloth("T-Shirt", "Adidas", 799, "L", "White", "Polyester"));
        cloth.save(new Cloth("Jeans", "Levis", 1999, "32", "Blue", "Denim"));
        cloth.save(new Cloth("Jacket", "Puma", 2499, "L", "Grey", "Wool"));
        cloth.save(new Cloth("Kurta", "FabIndia", 1299, "M", "Green", "Cotton"));
        cloth.save(new Cloth("Hoodie", "H&M", 1599, "L", "Black", "Fleece"));
       cloth.save(new Cloth("Shorts", "Zara", 899, "M", "Yellow", "Cotton"));
      cloth.save(new Cloth("Blazer", "Allen Solly", 2999, "L", "Navy", "Polyester"));
        cloth.save(new Cloth("Sweater", "Uniqlo", 1799, "M", "Brown", "Wool"));
        cloth.save(new Cloth("Track Pant", "Reebok", 1199, "L", "Grey", "Cotton"));
    }
}

  
  

	

		
