class ControlStatementSimple {

    public static void main(String[] args) {

        boolean isProcess = true;
        boolean isSubProcess = true;

        int count = 5;
        int monthNum = 3;
        String month = "march";

        if (isProcess) {
            if (isSubProcess) {
                System.out.println("Processing month...");
                while (count > 0) {
                    System.out.println("Count: " + count);
                    count--;
                }

                switch (monthNum) {
                    case 1: System.out.println("January"); break;
                    case 2: System.out.println("February"); break;
                    case 3: System.out.println("March"); break;
                    case 4: System.out.println("April"); break;
                    default: System.out.println("Invalid month number");
                }

            } else {
                System.out.println("Default processing...");
                while (count >= 0) {
                    System.out.println(count);
                    count--;
                }

                if (month.equals("january")) {
                    System.out.println("Month no is 1");
                } else if (month.equals("february")) {
                    System.out.println("Month no is 2");
                } else if (month.equals("march")) {
                    System.out.println("Month no is 3");
                } else {
                    System.out.println("Invalid month");
                }
            }
        }
    }
}