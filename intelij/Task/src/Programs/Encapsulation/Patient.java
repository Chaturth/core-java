package Programs.Encapsulation;

class Patient {
    private int patientID;
    private String patientName;
    private String disease;
    private double amount;

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getPatientID() {
        return patientID;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getDisease() {
        return disease;
    }

    
}
