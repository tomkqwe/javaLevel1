package org.example;


import java.util.Scanner;

public class FirstHomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int minutes = scanner.nextInt();
//        quarterOfHour(minutes);
//        double operand1 = scanner.nextDouble();
//        double operand2 = scanner.nextDouble();
//        char operation = '-';
//        double v = mathOperation(operand1, operand2, operation);
//        System.out.println(v);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double firstArea = areaOfTriangle(a, b);
        int a2 = scanner.nextInt();
        int b2 = scanner.nextInt();
        double secondArea = areaOfTriangle(a2, b2);

        compareAreaOfTiangle(firstArea,secondArea);


    }

    public static void quarterOfHour(int minutes) {
        if (minutes >= 0 && minutes <= 14) System.out.println("First quarter of an hour");
        if (minutes >= 15 && minutes <= 29) System.out.println("Second quarter of an hour");
        if (minutes >= 30 && minutes <= 44) System.out.println("Third quarter of an hour");
        if (minutes >= 45 && minutes <= 59) System.out.println("Fourth quarter of an hour");
    }

    public static double mathOperation(double oper1, double oper2, char operation) {
        switch (operation) {
            case '+':
                return oper1 + oper2;

            case '-':
                return oper1 - oper2;

            case '*':
                return oper1 * oper2;
            case '/':
                return oper1 / oper2;
            case '%':
                return oper1 % oper2;
            default:
                System.out.println("Incorretable math operator");
                return 0;

        }
    }

    public static double areaOfTriangle(int a, int b) {
        return 0.5 * a * b;
    }
    public static void compareAreaOfTiangle(double a, double b){
        boolean condition = a > b;
        if (condition) System.out.println("Площадь первого треугольника больше");
        if (a == b) System.out.println("Площади треугольников равны");
        if (!condition) System.out.println("Площадь второго треугольника больше");
    }

}
