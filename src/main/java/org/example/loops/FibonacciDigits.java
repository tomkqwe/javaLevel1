package org.example.loops;


import java.util.Scanner;

public class FibonacciDigits {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
//        printRecursive(number);
        printFib(number);

    }

    private static void recursiveFib(int first, int second, int treshold) {
        if (second < treshold) {
            System.out.println(second);
            recursiveFib(second, first + second, treshold);
        }
    }

    public static void printRecursive(int treshold) {
        int first = 0;
        int second = 1;
        recursiveFib(first, second, treshold);
    }

    public static void printFib(int treshold) {
        int first = 0;
        int second = 1;
        while (second < treshold) {
            System.out.println(second);
            int tmp = second;
            second += first;
            first = tmp;
        }

    }


}
