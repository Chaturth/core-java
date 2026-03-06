class Aquarium {

    int size;
    double price;
    float waterLevel;
    char type;
    boolean hasLight;

    Fish fish;
    WaterFilter filter;
    Plant plant;
    Heater heater;
    Glass glass;

    Aquarium(int size,double price,float waterLevel,char type,boolean hasLight,
             Fish fish,WaterFilter filter,Plant plant,Heater heater,Glass glass){

        this.size = size;
        this.price = price;
        this.waterLevel = waterLevel;
        this.type = type;
        this.hasLight = hasLight;
        this.fish = fish;
        this.filter = filter;
        this.plant = plant;
        this.heater = heater;
        this.glass = glass;
    }
	void getInfo()
{
    System.out.println("Size: " + size);
    System.out.println("Price: " + price);
    System.out.println("Water Level: " + waterLevel);
    System.out.println("Type: " + type);
    System.out.println("Has Light: " + hasLight);

    if(fish != null)
    {
        fish.getInfo();
    }

    if(filter != null)
    {
        filter.getInfo();
    }

    if(plant != null)
    {
        plant.getInfo();
    }

    if(heater != null)
    {
        heater.getInfo();
    }

    if(glass != null)
    {
        glass.getInfo();
    }
}
}