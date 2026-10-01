package Programs;

public class ElectricityBillCalculation {
    public static void main(String[] args) {

        String consumerName = "Rajesh";
        String typeOfBuilding = "Commercial";

        int[] readings = {1200, 1250, 1300, 1360, 1410, 1470, 1520};

        double totalBill = 0;

        for (int i = 1; i <= 6; i++) {

            int units = readings[i] - readings[i - 1];
            double bill;

            if (typeOfBuilding.equals("Commercial")) {
                bill = units * 8;
            } else {
                bill = 0;
            }

            System.out.println("Month " + i);
            System.out.println("Previous Reading = " + readings[i - 1]);
            System.out.println("Current Reading = " + readings[i]);
            System.out.println("Units = " + units);
            System.out.println("Bill = ₹" + bill);
            System.out.println();

            totalBill = totalBill + bill;
        }

        System.out.println("Consumer Name = " + consumerName);
        System.out.println("Total Bill = ₹" + totalBill);
        System.out.println("Balance to Pay = ₹" + totalBill);
    }
}
