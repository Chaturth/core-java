//Declare 12 classes with 5 IV, declare 6 constrctors in each class . Create a runner and create 6 instances for each class . Print variables for each instance. Droplet, Umbrella,Rain,Snow,HairDryer,Clip,ChessBoard, Track,Battery,Pawn,Carrom,Strawberry

class Rain{
	
	double size;
	
	String shape;
	
	double density;
	
	int fallSpeed;
	
	double ph;
	
	
		Rain(double size,String shape,double density,int fallSpeed,double ph)
		{
			this.size=size;
			this.shape=shape;
			this.density=density;
			this.fallSpeed=fallSpeed;
			this.ph=ph;
		}
	
	Rain(String shape,double density)
	{
		this.shape=shape;
			this.density=density;
	}
	
	Rain(int fallSpeed,double ph)
	{
		this.fallSpeed=fallSpeed;
			this.ph=ph;
	}
	
	Rain(double density,int fallSpeed,double ph)
	{
		this.density=density;
			this.fallSpeed=fallSpeed;
			this.ph=ph;
	}
	
	Rain(String shape)
	{
		this.shape=shape;
	}
	
	Rain()
	{
		
	}
	
}

		
	