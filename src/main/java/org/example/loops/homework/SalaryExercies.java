package org.example.loops.homework;


public class SalaryExercies {


    public static void main(String[] args) {
        int salary = 600;
        int salaryUp = 400;
        int salaryUpMonths = 6;
        int foodAndEntertainment = 300;

        double brokersPercentage = 0.25;
        double percentPerMonth = 0.02;
        double brokersBalance = 0;

        int months = 38;
        int bankAccount = 0;
        double brokerAccount = 0;
        for (int i = 1; i <= months; i++) {
            bankAccount += salary;
            bankAccount -= foodAndEntertainment;
            brokerAccount = bankAccount * brokersPercentage;
            bankAccount -= brokerAccount;
            if (i % salaryUpMonths == 0) salary += salaryUp;
            brokersBalance += calculateBrokersBalance(brokerAccount, percentPerMonth);
        }
        System.out.println("Cash on balance: " + bankAccount);
        System.out.println("Cash on broker balance: "+ brokersBalance);


    }

    private static double calculateBrokersBalance(double brokerAccount, double percentPerMonth) {
        return brokerAccount * percentPerMonth;
    }
}
