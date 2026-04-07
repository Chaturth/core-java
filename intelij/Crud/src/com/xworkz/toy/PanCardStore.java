package com.xworkz.toy;

public class PanCardStore {

    PanCard[] panCards;
    int currentIndex = 0;

    public PanCardStore(PanCard[] panCards) {
        this.panCards = panCards;
    }

    void addPanCard(PanCard p) {
        if (p != null) {
            if (currentIndex < panCards.length) {
                panCards[currentIndex] = p;
                currentIndex++;
                System.out.println("PanCard is added");
                System.out.println(p.holderName);
            } else {
                System.out.println("Array is full");
            }
        }
    }

    void display() {
        for (PanCard p : panCards) {
            if (p != null) {
                p.display();
            }
        }
    }

    void searchByAddress(String address) {
        boolean found = false;

        if (panCards != null) {
            for (PanCard p : panCards) {
                if (p != null && p.address != null &&
                        p.address.trim().equalsIgnoreCase(address.trim())) {
                    System.out.println("PanCard found");
                    System.out.println(p.holderName);
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("PanCard not found");
        }
    }

    void updateByDOB(String dateOfBirth, String newName) {
        boolean found = false;

        if (panCards != null) {
            for (PanCard p : panCards) {
                if (p != null && p.dateOfBirth != null &&
                        p.dateOfBirth.trim().equals(dateOfBirth.trim())) {
                    p.holderName = newName;
                    System.out.println("PanCard updated");
                    System.out.println(newName);
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("PanCard not updated");
        }
    }
}
