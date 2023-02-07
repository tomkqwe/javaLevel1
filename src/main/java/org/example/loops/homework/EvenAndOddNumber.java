package org.example.loops.homework;


import java.util.Scanner;

public class EvenAndOddNumber {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        printOddNumbers(number);
        printEvenNumbers(number);

    }

    private static void printEvenNumbers(int number) {
        System.out.println("Четные числа: ");
        while (number > 0){
            int i = number % 10;
            if (i % 2 == 0 ) System.out.println(i);
            number /= 10;
        }

    }

    private static void printOddNumbers(int number) {
        System.out.println("Нечетные числа: ");
        while (number > 0){
            int i = number % 10;
            if (i % 2 != 0 ) System.out.println(i);
            number /= 10;
        }

    }

}
