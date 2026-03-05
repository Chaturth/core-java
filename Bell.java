//Bell Cloud Aquarium

class Bell {

    int size;
    double price;
    float weight;
    char type;
    boolean electric;

    Metal metal;
    Sound sound;
    Rope rope;
    Temple temple;
    Manufacturer manufacturer;

    Bell(int size,double price,float weight,char type,boolean electric,
         Metal metal,Sound sound,Rope rope,Temple temple,Manufacturer manufacturer){

        this.size = size;
        this.price = price;
        this.weight = weight;
        this.type = type;
        this.electric = electric;
        this.metal = metal;
        this.sound = sound;
        this.rope = rope;
        this.temple = temple;
        this.manufacturer = manufacturer;
    }
}