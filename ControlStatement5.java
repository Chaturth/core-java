class ControlStatementSimple5 {

    public static void main(String[] args) {

        boolean isStudent = true;
        boolean hasPassed = true;

        int marks = 4;
        int subjectNum = 1;
        String subject = "math";

        if (isStudent) {
            if (hasPassed) {
                System.out.println("Pass process initiated...");
                while (marks > 0) {
                    System.out.println("Marks remaining to review: " + marks);
                    marks--;
                }

                switch (subjectNum) {
                    case 1: System.out.println("Mathematics"); break;
                    case 2: System.out.println("Science"); break;
                    case 3: System.out.println("History"); break;
                    case 4: System.out.println("English"); break;
                    default: System.out.println("Invalid subject number");
                }

            } else {
                System.out.println("Fail process initiated...");
                while (marks >= 0) {
                    System.out.println("Rechecking mark: " + marks);
                    marks--;
                }

                if (subject.equals("math")) {
                    System.out.println("Subject no is 1");
                } else if (subject.equals("science")) {
                    System.out.println("Subject no is 2");
                } else if (subject.equals("history")) {
                    System.out.println("Subject no is 3");
                } else if (subject.equals("english")) {
                    System.out.println("Subject no is 4");
                } else {
                    System.out.println("Invalid subject");
                }

                System.out.println("Re-exam preparation steps:");
                for (int i = 1; i <= 3; i++) {
                    System.out.println("Step " + i + " completed");
                }
            }
        }
    }
}