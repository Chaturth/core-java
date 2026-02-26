//Declare below 6 types, then declare 2 variables in each class, then write over-loaded const to init those variables. Write 3 seperate creator classes to create an instances. Each Creator declare three over-loaded static methods to create instances , print the IV of the instance created . Create a Runner to invoke all the methods of creator classes. Musuem Zoo Stadium MusuemCreator ZooCreator StadiumCreator

class Museum {
    String name;
    double entryFee;

    Museum(double entryFee) {
        this.entryFee = entryFee; 
        System.out.println("Constructor with entryFee called");
    }


    Museum(String name, double entryFee) {
        this.name = name;
        this.entryFee = entryFee; 
        System.out.println("Constructor with name and entryFee called");
    }

   
    Museum(String name) {
        this.name = name;
        System.out.println("Constructor with name called");
    }
}

	
		
	
	