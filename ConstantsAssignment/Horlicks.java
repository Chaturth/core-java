class Horlicks {

    HorlicksName horlicksName;
    int price;
    HorlicksType horlicksType;

    Horlicks(HorlicksName horlicksName, int price, HorlicksType horlicksType){
        this.horlicksName = horlicksName;
        this.price = price;
        this.horlicksType = horlicksType;
    }

    void printInfo(){

        if(horlicksName != null){
            System.out.println("Horlicks Name: " + horlicksName.name);
        }
        else{
            System.out.println("Horlicks name is null");
        }

        if(horlicksType != null){
            System.out.println("Horlicks Type: " + horlicksType);
        }
        else{
            System.out.println("Horlicks type is null");
        }

        System.out.println("Price: " + price);
        System.out.println("------------");
    }

   
}