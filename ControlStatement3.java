class ControlStatementSimple3 {

    public static void main(String[] args) {

        boolean isOrder = true;
        boolean isPriority = false;

        int items = 4;
        int dayNum = 6;
        String day = "saturday";

        if (isOrder) {
            if (isPriority) {
                System.out.println("Priority order processing...");
                while (items > 0) {
                    System.out.println("Items left: " + items);
                    items--;
                }

                switch (dayNum) {
                    case 1: System.out.println("Monday"); break;
                    case 2: System.out.println("Tuesday"); break;
                    case 3: System.out.println("Wednesday"); break;
                    case 4: System.out.println("Thursday"); break;
                    case 5: System.out.println("Friday"); break;
                    case 6: System.out.println("Saturday"); break;
                    case 7: System.out.println("Sunday"); break;
                    default: System.out.println("Invalid day number");
                }

            } else {
                System.out.println("Normal order processing...");
                while (items >= 0) {
                    System.out.println("Checking item: " + items);
                    items--;
                }

                if (day.equals("monday")) {
                    System.out.println("Day no is 1");
                } else if (day.equals("tuesday")) {
                    System.out.println("Day no is 2");
                } else if (day.equals("wednesday")) {
                    System.out.println("Day no is 3");
                } else if (day.equals("thursday")) {
                    System.out.println("Day no is 4");
                } else if (day.equals("friday")) {
                    System.out.println("Day no is 5");
                } else if (day.equals("saturday")) {
                    System.out.println("Day no is 6");
                } else if (day.equals("sunday")) {
                    System.out.println("Day no is 7");
                } else {
                    System.out.println("Invalid day");
                }

                System.out.println("Final verification:");
                for (int i = 1; i <= 3; i++) {
                    System.out.println("Verification step " + i);
                }
            }
        }
    }
}