package com.xworkz.medical;

public class Medical {




        String name;
        int numberOfStaff;
        double dailyIncome;
        double monthlyRent;
        String type;

        public Medical(String name, int numberOfStaff, double dailyIncome, double monthlyRent, String type) {
            this.name = name;
            this.numberOfStaff = numberOfStaff;
            this.dailyIncome = dailyIncome;
            this.monthlyRent = monthlyRent;
            this.type = type;
        }

        void display() {
            System.out.println("Name: " + name);
            System.out.println("Number Of Staff: " + numberOfStaff);
            System.out.println("Daily Income: " + dailyIncome);
            System.out.println("Monthly Rent: " + monthlyRent);
            System.out.println("Type: " + type);
        }

}
