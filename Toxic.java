class Toxic {

    String substanceName;
    String chemicalFormula;
    String type;
    String color;
    String smell;
    String state;
    double toxicityLevel;
    String effectOnHumans;
    String effectOnAnimals;
    String effectOnPlants;
    boolean isFlammable;
    boolean isRadioactive;
    String storageMethod;
    String safetyEquipment;
    String exposureMethod;
    String antidote;
    String discoveredBy;
    int discoveredYear;
    String industryUsage;
    String remarks;


    Toxic(String substanceName, String chemicalFormula, String type, String color,
          String smell, String state, double toxicityLevel, String effectOnHumans,
          String effectOnAnimals, String effectOnPlants, boolean isFlammable,
          boolean isRadioactive, String storageMethod, String safetyEquipment,
          String exposureMethod, String antidote, String discoveredBy,
          int discoveredYear, String industryUsage, String remarks)
    {
        this.substanceName = substanceName;
        this.chemicalFormula = chemicalFormula;
        this.type = type;
        this.color = color;
        this.smell = smell;
        this.state = state;
        this.toxicityLevel = toxicityLevel;
        this.effectOnHumans = effectOnHumans;
        this.effectOnAnimals = effectOnAnimals;
        this.effectOnPlants = effectOnPlants;
        this.isFlammable = isFlammable;
        this.isRadioactive = isRadioactive;
        this.storageMethod = storageMethod;
        this.safetyEquipment = safetyEquipment;
        this.exposureMethod = exposureMethod;
        this.antidote = antidote;
        this.discoveredBy = discoveredBy;
        this.discoveredYear = discoveredYear;
        this.industryUsage = industryUsage;
        this.remarks = remarks;
    }


    void show()
    {
        System.out.println("Running Toxic:");

        System.out.println("Substance Name: " + substanceName);
        System.out.println("Chemical Formula: " + chemicalFormula);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Smell: " + smell);
        System.out.println("State: " + state);
        System.out.println("Toxicity Level: " + toxicityLevel);
        System.out.println("Effect On Humans: " + effectOnHumans);
        System.out.println("Effect On Animals: " + effectOnAnimals);
        System.out.println("Effect On Plants: " + effectOnPlants);
        System.out.println("Flammable: " + isFlammable);
        System.out.println("Radioactive: " + isRadioactive);
        System.out.println("Storage Method: " + storageMethod);
        System.out.println("Safety Equipment: " + safetyEquipment);
        System.out.println("Exposure Method: " + exposureMethod);
        System.out.println("Antidote: " + antidote);
        System.out.println("Discovered By: " + discoveredBy);
        System.out.println("Discovered Year: " + discoveredYear);
        System.out.println("Industry Usage: " + industryUsage);
        System.out.println("Remarks: " + remarks);

        System.out.println();
    }
}