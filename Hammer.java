//Hammer,Jamoon,Banner,CarrotHalwa,Tower

class Hammer {

    String[] equipment;
    Surface[] surfaces;

    Hammer(String[] equipment, Surface[] surfaces) {
        this.equipment = equipment;
        this.surfaces = surfaces;
    }

    void display() {
        System.out.println("Length of equipment: " + equipment.length);
        for (String eq : equipment) {
            System.out.println("Equipment: " + eq);
        }

        System.out.println("Length of surfaces: " + surfaces.length);
        for (Surface s : surfaces) {
            System.out.println("Surface: " + s.name);
        }
    }
}