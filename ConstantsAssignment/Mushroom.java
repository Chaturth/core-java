class Mushroom {

    MushroomName mushroomName;
    int price;
    MushroomType mushroomType;

    Mushroom(MushroomName mushroomName, int price, MushroomType mushroomType){
        this.mushroomName = mushroomName;
        this.price = price;
        this.mushroomType = mushroomType;
    }

    void printInfo(){

        if(mushroomName != null){
            System.out.println("Mushroom Name: " + mushroomName.name);
        } else{
            System.out.println("Mushroom name is null");
        }

        if(mushroomType != null){
            System.out.println("Mushroom Type: " + mushroomType);
        } else{
            System.out.println("Mushroom type is null");
        }

        System.out.println("Price: " + price);
        System.out.println("------------");
    }

   
}