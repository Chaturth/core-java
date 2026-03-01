class Brain {

    String personName;
    double weight;
    String color;
    String size;
    int age;
    String intelligenceLevel;
    String memoryLevel;
    String brainType;
    boolean healthy;
    String function;
    String leftHemisphereFunction;
    String rightHemisphereFunction;
    String nervousSystemType;
    String thinkingAbility;
    String learningAbility;
    String reactionSpeed;
    String emotionalControl;
    String sleepHours;
    String nutritionType;
    String remarks;


    Brain(String personName, double weight, String color, String size,
          int age, String intelligenceLevel, String memoryLevel,
          String brainType, boolean healthy, String function,
          String leftHemisphereFunction, String rightHemisphereFunction,
          String nervousSystemType, String thinkingAbility,
          String learningAbility, String reactionSpeed,
          String emotionalControl, String sleepHours,
          String nutritionType, String remarks)
    {
        this.personName = personName;
        this.weight = weight;
        this.color = color;
        this.size = size;
        this.age = age;
        this.intelligenceLevel = intelligenceLevel;
        this.memoryLevel = memoryLevel;
        this.brainType = brainType;
        this.healthy = healthy;
        this.function = function;
        this.leftHemisphereFunction = leftHemisphereFunction;
        this.rightHemisphereFunction = rightHemisphereFunction;
        this.nervousSystemType = nervousSystemType;
        this.thinkingAbility = thinkingAbility;
        this.learningAbility = learningAbility;
        this.reactionSpeed = reactionSpeed;
        this.emotionalControl = emotionalControl;
        this.sleepHours = sleepHours;
        this.nutritionType = nutritionType;
        this.remarks = remarks;
    }


    void show()
    {
        System.out.println("Running Brain:");

        System.out.println("Person Name: " + personName);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Age: " + age);
        System.out.println("Intelligence Level: " + intelligenceLevel);
        System.out.println("Memory Level: " + memoryLevel);
        System.out.println("Brain Type: " + brainType);
        System.out.println("Healthy: " + healthy);
        System.out.println("Function: " + function);
        System.out.println("Left Hemisphere Function: " + leftHemisphereFunction);
        System.out.println("Right Hemisphere Function: " + rightHemisphereFunction);
        System.out.println("Nervous System Type: " + nervousSystemType);
        System.out.println("Thinking Ability: " + thinkingAbility);
        System.out.println("Learning Ability: " + learningAbility);
        System.out.println("Reaction Speed: " + reactionSpeed);
        System.out.println("Emotional Control: " + emotionalControl);
        System.out.println("Sleep Hours: " + sleepHours);
        System.out.println("Nutrition Type: " + nutritionType);
        System.out.println("Remarks: " + remarks);

        System.out.println();
    }
}