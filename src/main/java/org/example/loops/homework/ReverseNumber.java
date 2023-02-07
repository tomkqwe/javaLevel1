package org.example.loops.homework;


import java.util.Scanner;

public class ReverseNumber {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        int i = printReverseNumber(number);
        System.out.println(i);

    }

    private static int printReverseNumber(int number) {
        int result = 0;
        while (number > 0){
            result = result * 10 + number % 10;
            number /= 10;
        }
        return result;
    }
}
