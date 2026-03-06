class Dolphin {

    int dolphinId;
    String species;
    String name;
    int age;
    double length;
    double weight;
    String color;
    String habitat;
    String diet;
    boolean isTrained;
    String trainerName;
    String origin;
    String gender;
    double swimSpeed;
    int jumpHeight;
    boolean isEndangered;
    String oceanRegion;
    String favoriteActivity;
    int dailyFoodIntake;
    String healthStatus;

    Dolphin(int dolphinId, String species, String name, int age,
            double length, double weight, String color, String habitat,
            String diet, boolean isTrained, String trainerName,
            String origin, String gender, double swimSpeed,
            int jumpHeight, boolean isEndangered, String oceanRegion,
            String favoriteActivity, int dailyFoodIntake,
            String healthStatus) {

        this.dolphinId = dolphinId;
        this.species = species;
        this.name = name;
        this.age = age;
        this.length = length;
        this.weight = weight;
        this.color = color;
        this.habitat = habitat;
        this.diet = diet;
        this.isTrained = isTrained;
        this.trainerName = trainerName;
        this.origin = origin;
        this.gender = gender;
        this.swimSpeed = swimSpeed;
        this.jumpHeight = jumpHeight;
        this.isEndangered = isEndangered;
        this.oceanRegion = oceanRegion;
        this.favoriteActivity = favoriteActivity;
        this.dailyFoodIntake = dailyFoodIntake;
        this.healthStatus = healthStatus;
    }

    static void greet() {
        System.out.println("Hello from Dolphin");
    }

    static void info() {
        System.out.println("Dolphins are intelligent mammals");
    }

    static void displayColor() {
        System.out.println("Dolphins are generally gray");
    }

    static void displayLength() {
        System.out.println("Average length is 2-4 meters");
    }

    static void farewell() {
        System.out.println("Goodbye from Dolphin");
    }
}