class TennisBall {

    int ballId;
    String brand;
    String color;
    double weight;
    double diameter;
    String material;
    boolean isUsed;
    int bounceCount;
    String type;
    String countryMade;
    double price;
    boolean isPressurized;
    String qualityGrade;
    String packagingType;
    String condition;

    static void sportInfo() {
        System.out.println("Used in tennis sport");
    }

    static void materialInfo() {
        System.out.println("Made of rubber and felt");
    }

    static void sizeInfo() {
        System.out.println("Standard diameter around 6.7 cm");
    }

    static void pressureInfo() {
        System.out.println("Pressurized for better bounce");
    }

    static void usageRule() {
        System.out.println("Replace ball after heavy use");
    }

    void showDetails() {
        System.out.println(ballId);
        System.out.println(brand);
        System.out.println(color);
        System.out.println(weight);
        System.out.println(diameter);
        System.out.println(material);
        System.out.println(isUsed);
        System.out.println(bounceCount);
        System.out.println(type);
        System.out.println(countryMade);
        System.out.println(price);
        System.out.println(isPressurized);
        System.out.println(qualityGrade);
        System.out.println(packagingType);
        System.out.println(condition);
		
	}
}
