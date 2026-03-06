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
	void getInfo()
{
    System.out.println("Cups: " + cups);
    System.out.println("Price: " + price);
    System.out.println("Temperature: " + temperature);
    System.out.println("Size: " + size);
    System.out.println("With Milk: " + withMilk);

    if(leaf != null)
    {
        leaf.getInfo();
    }

    if(water != null)
    {
        water.getInfo();
    }

    if(sugar != null)
    {
        sugar.getInfo();
    }

    if(milk != null)
    {
        milk.getInfo();
    }

    if(kettle != null)
    {
        kettle.getInfo();
    }
}
}