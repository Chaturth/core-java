class ControlStatementSimple {

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
                    case 6: System.out.println("Saturday"); break;
                    default: System.out.println("Other day");
                }

            } else {
                
                System.out.println("Normal order processing...");
                while (items >= 0) {
                    System.out.println("Checking item: " + items);
                    items--;
                }

                if (day.equals("saturday")) {
                    System.out.println("Day no is 6");
                } else {
                    System.out.println("Other day");
                }

                
                System.out.println("Final verification:");
                for (int i = 1; i <= 3; i++) {
                    System.out.println("Step " + i);
                }
            }
        }
    }
}