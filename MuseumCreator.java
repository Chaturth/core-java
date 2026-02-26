
class MuseumCreator {

   
    public static void getMuseum() {
        System.out.println("Museum 1 is created with default values:");

     
        Museum m1 = new Museum("amazon museum", 100);

        System.out.println("Museum name is: " + m1.name);
        System.out.println("Museum entry fee is: " + m1.entryFee);
        System.out.println();
    }

  
    public static void getMuseum(String name) {
        System.out.println("Museum 2 is created:");
        Museum m2 = new Museum(name);
        System.out.println("Museum name is: " + m2.name);
        System.out.println();
    }

   
    public static void getMuseum(String name, double entryFee) {
        System.out.println("Museum 3 is created:");
        Museum m3 = new Museum(name, entryFee);
        System.out.println("Museum name is: " + m3.name);
        System.out.println("Museum entry fee is: " + m3.entryFee);
        System.out.println();
    }
   
   
   
}




	
	
	
	
	
	