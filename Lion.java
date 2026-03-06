//Lion Motor Coach Ipl Spa Tea Bell Cloud Aquarium
class Lion {

    String lionName;
    int age;
    double weight;
    boolean isMale;
    char groupCode;

    Habitat habitat;
    Food food;
    Zoo zoo;
    Caretaker caretaker;
    HealthRecord healthRecord;

    Lion(String lionName,
         int age,
         double weight,
         boolean isMale,
         char groupCode,
         Habitat habitat,
         Food food,
         Zoo zoo,
         Caretaker caretaker,
         HealthRecord healthRecord) {

        this.lionName = lionName;
        this.age = age;
        this.weight = weight;
        this.isMale = isMale;
        this.groupCode = groupCode;
        this.habitat = habitat;
        this.food = food;
        this.zoo = zoo;
        this.caretaker = caretaker;
        this.healthRecord = healthRecord;
    }
	void getInfo()
{
    System.out.println("Lion Name: " + lionName);
    System.out.println("Age: " + age);
    System.out.println("Weight: " + weight);
    System.out.println("Is Male: " + isMale);
    System.out.println("Group Code: " + groupCode);

    if(habitat != null)
    {
        habitat.getInfo();
    }

    if(food != null)
    {
        food.getInfo();
    }

    if(zoo != null)
    {
        zoo.getInfo();
    }

    if(caretaker != null)
    {
        caretaker.getInfo();
    }

    if(healthRecord != null)
    {
        healthRecord.getInfo();
    }

}
}

		
		
		
