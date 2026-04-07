package com.xworkz.medical;

public class MedicalStore {

    Medical[] medicals;
    int currentIndex = 0;

    public MedicalStore(Medical[] medicals) {
        this.medicals = medicals;
    }

    void addMedical(Medical m) {
        int index = medicals.length;

        if (m != null) {
            if (currentIndex < index) {
                medicals[currentIndex] = m;
                currentIndex++;
                System.out.println("Medical added");
                System.out.println(m.name);
            } else {
                System.out.println("Array is full");
            }
        }
    }

    void search(String name) {
        boolean found = false;

        if (medicals != null) {
            for (Medical m : medicals) {
                if (m != null && m.name.equals(name)) {
                    System.out.println("Medical found");
                    System.out.println(m.name);
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("Medical not found");
        }
    }

    void update(String name, String newName) {
        boolean found = false;

        if (medicals != null) {
            for (Medical m : medicals) {
                if (m != null && m.name.equals(name)) {
                    m.name = newName;
                    System.out.println("Medical updated");
                    System.out.println(m.name);
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("Medical not updated");
        }
    }
   void display()
   {
       for(Medical m:medicals){
           if(m!=null){
               m.display();
           }
       }
   }
}
