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
}