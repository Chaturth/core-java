//Declare all the below classes, then declare two instance variables , One variable array either a String or a primitive . One variable array which your own class, then init using constructor, then display all the variable info using an instance method . Then Create a runner with init arrays needed for the class with least 3 indexes, then pass the array references and invoke info method. Printer,Painter,Carpenter,Server,Joker,Scanner,Broker,Hammer,Jamoon,Banner,CarrotHalwa,Tower Total : 52 instances


class Printer{

    String[] printerType;
    Brands[] brand;

    Printer(String[] printerType, Brands[] brand){
        this.printerType = printerType;
        this.brand = brand;
    }

    void display()
    {
        System.out.println("len of printertype: " + printerType.length);
        System.out.println("len of brands: " + brand.length);

        if(this.printerType != null)
        {
            for(String type : this.printerType)
            {
                System.out.println("Type of the printers: " + type);
            }
        }

        if(this.brand != null)
        {
            for(Brands brands : this.brand)
            {
                System.out.println("Brands of printer: " + brands.name);
            }
        }
    }
}

	