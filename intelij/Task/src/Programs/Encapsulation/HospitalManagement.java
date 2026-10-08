package Programs.Encapsulation;

public class HospitalManagement {

    public static void main(String[] args) {

        Patient p = new Patient();

        p.setAmount(500);
        p.setDisease("feever");
        p.setPatientID(1);
        p.setPatientName("saajan");

        System.out.println("Patient name:"+p.getPatientName());
        System.out.println("Patient ID:"+p.getPatientID());
        System.out.println("Patient disease:"+p.getDisease());
        System.out.println("Amount charged for this patient:"+p.getAmount());
    }
}
