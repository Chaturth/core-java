class Mousepad {

    boolean available;

    Mousepad() {
    }

    Mousepad(boolean available) {
        this.available = available;
    }

    void getInfo() {
        System.out.println("Mousepad available: " + available);
    }
}