package org.example.hw1;

public class Floor {
    private int number;
    private Apartment[] apartments;

    public Floor(int number, Apartment[] apartments) {
        this.number = number;
        this.apartments = apartments;
    }

    public int getNumber() {
        return number;
    }

    public Apartment[] getApartments() {
        return apartments;
    }

    public void print() {
        System.out.println("Этаж номер " + number + " ,количество квартир " + apartments.length);
    }
}
