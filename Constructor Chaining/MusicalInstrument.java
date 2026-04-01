//Declare below as parent classes, declare three properties in each class, make sure add a const to init all the instance variable. Then declare a subclass, init the variables using super(...). In Runner create 3 instances of the subclass, print the instance variables MusicInstrument,Stage, StairCase,Reel,Building,Chicken,Butter,Shaavarma,BlueWhale,GermanShepherd

class MusicalInstrument{
	
	String instrumentName;
	double price;
	int noOfMusicians;
	
	MusicalInstrument(String instrumentName,double price,int noOfMusicians)
	{
		
		this.instrumentName=instrumentName;
		this.price=price;
		this.noOfMusicians=noOfMusicians;
		
	}



}