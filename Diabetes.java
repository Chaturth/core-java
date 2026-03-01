class Diabetes {

    String patientName;
    int age;
    String gender;
    String diabetesType;
    double sugarLevel;
    double fastingSugar;
    double postMealSugar;
    boolean insulinRequired;
    String doctorName;
    String hospitalName;
    String symptoms;
    String medication;
    String dietPlan;
    String exercisePlan;
    double weight;
    double height;
    String bloodGroup;
    int diagnosisYear;
    String conditionStatus;
    String remarks;


    Diabetes(String patientName, int age, String gender, String diabetesType,
             double sugarLevel, double fastingSugar, double postMealSugar,
             boolean insulinRequired, String doctorName, String hospitalName,
             String symptoms, String medication, String dietPlan,
             String exercisePlan, double weight, double height,
             String bloodGroup, int diagnosisYear,
             String conditionStatus, String remarks)
    {
        this.patientName = patientName;
        this.age = age;
        this.gender = gender;
        this.diabetesType = diabetesType;
        this.sugarLevel = sugarLevel;
        this.fastingSugar = fastingSugar;
        this.postMealSugar = postMealSugar;
        this.insulinRequired = insulinRequired;
        this.doctorName = doctorName;
        this.hospitalName = hospitalName;
        this.symptoms = symptoms;
        this.medication = medication;
        this.dietPlan = dietPlan;
        this.exercisePlan = exercisePlan;
        this.weight = weight;
        this.height = height;
        this.bloodGroup = bloodGroup;
        this.diagnosisYear = diagnosisYear;
        this.conditionStatus = conditionStatus;
        this.remarks = remarks;
    }


    void show()
    {
        System.out.println("Running Diabetes:");

        System.out.println("Patient Name: " + patientName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Diabetes Type: " + diabetesType);
        System.out.println("Sugar Level: " + sugarLevel);
        System.out.println("Fasting Sugar: " + fastingSugar);
        System.out.println("Post Meal Sugar: " + postMealSugar);
        System.out.println("Insulin Required: " + insulinRequired);
        System.out.println("Doctor Name: " + doctorName);
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Symptoms: " + symptoms);
        System.out.println("Medication: " + medication);
        System.out.println("Diet Plan: " + dietPlan);
        System.out.println("Exercise Plan: " + exercisePlan);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + height + " cm");
        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("Diagnosis Year: " + diagnosisYear);
        System.out.println("Condition Status: " + conditionStatus);
        System.out.println("Remarks: " + remarks);

        System.out.println();
    }
}