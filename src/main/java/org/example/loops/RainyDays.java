package org.example.loops;


import java.util.Scanner;

public class RainyDays {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во дней: ");
        int N = scanner.nextInt();
        printRainyDays(N);


    }

    private static void printRainyDays(int n) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int maxValue = -7777;
        for (int i = 0; i < n; i++) {
            System.out.println("Введите величину осадков в день " + (i + 1));
            int value = scanner.nextInt();
            sum += value;
            if (maxValue < value) {
                maxValue = value;
            }
        }
        System.out.println(" Количество дней: " + n);
        System.out.println("Сумма осадков за этот период: " + sum);
        System.out.println("Среднее количество осадков за этот период: " + ((double) sum / n));
        System.out.println("Максимальное количество дневных осадков за этот период: " + maxValue);

    }


}
