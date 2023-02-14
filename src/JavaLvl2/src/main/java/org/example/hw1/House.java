package org.example.hw1;

public class House {
    private final int number;
    private final Floor[] floors;

    public int getNumber() {
        return number;
    }

    public Floor[] getFloors() {
        return floors;
    }

    public House(int number, Floor[] floors) {
        this.number = number;
        this.floors = floors;
    }

    public void print() {
        System.out.println("Дом номер " + number + " ,количество этажей " + floors.length);
    }
}
