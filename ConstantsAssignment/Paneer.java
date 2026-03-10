class Paneer {

    PaneerName paneerName;
    int price;
    PaneerType paneerType;

    Paneer(PaneerName paneerName, int price, PaneerType paneerType){
        this.paneerName = paneerName;
        this.price = price;
        this.paneerType = paneerType;
    }

    void printInfo(){

        if(paneerName != null){
            System.out.println("Paneer Name: " + paneerName.name);
        } else{
            System.out.println("Paneer name is null");
        }

        if(paneerType != null){
            System.out.println("Paneer Type: " + paneerType);
        } else{
            System.out.println("Paneer type is null");
        }

        System.out.println("Price: " + price);
        System.out.println("------------");
    }

    
}