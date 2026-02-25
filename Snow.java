class Snow {
    double thickness;
    String color;
    double density;
    int fallSpeed;
    double temperature;

    Snow(double thickness, String color, double density, int fallSpeed, double temperature) {
        this.thickness = thickness;
        this.color = color;
        this.density = density;
        this.fallSpeed = fallSpeed;
        this.temperature = temperature;
    }

    Snow(String color, double density) {
        this.color = color;
        this.density = density;
    }

    Snow(int fallSpeed, double temperature) {
        this.fallSpeed = fallSpeed;
        this.temperature = temperature;
    }

    Snow(double density, int fallSpeed, double temperature) {
        this.density = density;
        this.fallSpeed = fallSpeed;
        this.temperature = temperature;
    }

    Snow(String color) {
        this.color = color;
    }

    Snow() {
        
    }
}