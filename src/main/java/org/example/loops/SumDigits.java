package org.example.loops;


import java.util.Scanner;

public class SumDigits {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        int result = sumOfDigits(number);
        System.out.println("Сумма цифр числа: ");
        System.out.println(result);
    }
//    12345

    private static int sumOfDigits(int number) {
        int result = 0;
        for (int i = number; i > 0; i /= 10) {
            result += i % 10;
        }
        return result;
    }
}
