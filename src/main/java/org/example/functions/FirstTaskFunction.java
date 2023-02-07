package org.example.functions;

import java.util.Scanner;


public class FirstTaskFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите день: ");
        int day = scanner.nextInt();
        System.out.println("Введите месяц: ");
        int month = scanner.nextInt();
        System.out.println("Введите год: ");
        int year = scanner.nextInt();

        if (checkNegativeDate(day, month, year)) return;
        day++;
        if ((day > 30 && isThirtyDaysAtMonth(month)) || (day > 28 && month == 2) ) {
            day = 1;
            month++;
        } else if (day > 31 && isThirtyoneDaysAtMonth(month)) {
            day = 1;
            month++;
        }
        if (month == 13) {
            month = 1;
            year++;
        }

        String result = getDate(day, month, year);


        System.out.println(result);
    }

    private static boolean isThirtyoneDaysAtMonth(int month) {
        return month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;
    }

    private static boolean isThirtyDaysAtMonth(int month) {
        return month == 4 || month == 6 || month == 9 || month == 11;
    }

    private static boolean checkNegativeDate(int day, int month, int year) {
        if (day < 0 || month < 0 || year < 0) {
            System.out.println("День, месяц или год не может быть меньше, либо равен нулю");
            return true;
        }
        return false;
    }

    private static String getDate(int day, int month, int year) {
        return day + "." + month + "." + year;
    }

}
