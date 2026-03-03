class Penguin {

    int penguinId;
    String name;
    String species;
    String habitat;
    String color;
    int age;
    double height;
    double weight;
    boolean canSwim;
    boolean canSlide;
    String diet;
    String region;
    String gender;
    int swimSpeed;
    String healthStatus;

    static void speciesInfo() {
        System.out.println("Penguins are flightless birds");
    }

    static void habitatInfo() {
        System.out.println("Live mostly in cold regions");
    }

    static void foodInfo() {
        System.out.println("Eat fish and squid");
    }

    static void swimInfo() {
        System.out.println("Excellent swimmers");
    }

    static void funFact() {
        System.out.println("They slide on ice");
    }

    void showDetails() {
        System.out.println(penguinId);
        System.out.println(name);
        System.out.println(species);
        System.out.println(habitat);
        System.out.println(color);
        System.out.println(age);
        System.out.println(height);
        System.out.println(weight);
        System.out.println(canSwim);
        System.out.println(canSlide);
        System.out.println(diet);
        System.out.println(region);
        System.out.println(gender);
        System.out.println(swimSpeed);
        System.out.println(healthStatus);
    }
}