package Programs;

public class ElectricityBillCalculation {
    public static void main(String[] args) {

        int ConsumerId=1;
        String ConsumerName="Rajesh";
        String TypeOfBuilding="Residential";
        double PreviousReading=1200;
        double CurrentReading=1250;

        System.out.printf("%-15s %-20s %-20s %-20s %-20s %n",
                "Consumer ID","Consumer Name","Type of building","Previous Reading","Current Reading");

        System.out.printf("%-15d %-20s %-20s %-20.2f %-20.2f %n",
                ConsumerId,ConsumerName,TypeOfBuilding,PreviousReading,CurrentReading);



    }
}
