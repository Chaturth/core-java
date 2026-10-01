package Programs;

public class LoanApproval {

    public static void main(String[] args) {

        String name = "Chaturth";
        boolean employed = true;
        double salary = 40000;
        int creditScore = 750;

        if (employed == true && salary >= 30000 && creditScore >= 700) {
            System.out.println("Loan Approved");
        } else {
            System.out.println("Loan Rejected");
        }
    }
}
