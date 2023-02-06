package org.example;


import java.util.Scanner;

public class FirstHomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutes = scanner.nextInt();
        quarterOfHour(minutes);
    }
    public static void quarterOfHour(int minutes){
        if (minutes>=0 && minutes<=14) System.out.println("First quarter of an hour");
        if (minutes>=15 && minutes<=29) System.out.println("Second quarter of an hour");
        if (minutes>=30 && minutes<=44) System.out.println("Third quarter of an hour");
        if (minutes>=45 && minutes<=59) System.out.println("Fourth quarter of an hour");
    }
}
