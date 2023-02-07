package org.example.functions;

import java.util.Scanner;


public class SecondTaskFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a: ");
        int a = scanner.nextInt();
        System.out.println("Введите b: ");

        int b = scanner.nextInt();
        System.out.println("Введите c: ");

        int c = scanner.nextInt();
        run(a, b, c);
    }

    private static double run(int a, int b, int c) {
        double discriminant = discriminant(a, b, c);
        boolean positive = isPositive(discriminant);
        boolean zero = isZero(discriminant);
        if (!positive && !zero) {
            System.out.println("Действительных корней нет");
            return 0;
        }
        if (zero) {
            //x = -b/2a
            double x = -b / (2.0 * a);
            System.out.println("Единственный корень: " + x);
            return 0;
        } else {
            //x = (-b +(-) √discriminant)/ 2 * a
            double fitstX = -b + Math.sqrt(discriminant) / 2 * a;
            double secondX = -b - Math.sqrt(discriminant) / 2 * a;
            System.out.println("Первый корень: "+ fitstX);
            System.out.println("Второй корень: "+ secondX);
            return 0;
        }
    }

    private static boolean isPositive(double discriminant) {
        return discriminant > 0;
    }

    private static boolean isZero(double discriminant) {
        return discriminant == 0;
    }

    private static double discriminant(int a, int b, int c) {
        //ax^2 + bx +c = 0
        double dis = b * b - 4 * a * c;
        return dis;

    }


}
