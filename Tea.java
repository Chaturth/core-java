class Tea {

    int cups;
    double price;
    float temperature;
    char size;
    boolean withMilk;

    Leaf leaf;
    Water water;
    Sugar sugar;
    Milk milk;
    Kettle kettle;

    Tea(int cups,double price,float temperature,char size,boolean withMilk,
        Leaf leaf,Water water,Sugar sugar,Milk milk,Kettle kettle){

        this.cups = cups;
        this.price = price;
        this.temperature = temperature;
        this.size = size;
        this.withMilk = withMilk;
        this.leaf = leaf;
        this.water = water;
        this.sugar = sugar;
        this.milk = milk;
        this.kettle = kettle;
    }
}