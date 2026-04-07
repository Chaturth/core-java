package com.xworkz.toy;

public class ToyStore {

    Toy[] toy;
    int currentIndex=0;

    public ToyStore(Toy[] toy) {
        this.toy = toy;
    }

    void addToy(Toy toys){
        int index=toy.length;
        if(toys!=null){
            if(currentIndex<index){
                toy[currentIndex]=toys;
                currentIndex++;
                System.out.println("Toy is added");
                System.out.println(toys.name);
                System.out.println(currentIndex);
            }

        }
        else{
            System.out.println("array is full ");
        }
    }
void display(){
  for(Toy toy:this.toy)  {
      if(toy!=null) {
          toy.display();
      }
  }
}
    void search(String name){
        boolean found =false;
        if(toy!=null){
            for(Toy t : toy){
                if(t!=null && t.name.equals(name)){
                    System.out.println("toy is found");
                    System.out.println("toy:"+t.name);
                    found=true;
                    break;
                }
            }
        }
        if(!found){
            System.out.println("toy is not found");
        }
    }

    void update(String name ,String newName){
        boolean found =false;
        if(toy!=null){
            for(Toy t : toy){
                if(t!=null && t.name.equals(name)){
                    t.name=newName;
                    System.out.println("toy is updated");
                    System.out.println("toy:"+t.price);
                    System.out.println("toy:"+t.name);
                    found=true;
                    break;
                }
            }
        }
        if(!found){
            System.out.println("toy is not updates");
        }
    }


}
