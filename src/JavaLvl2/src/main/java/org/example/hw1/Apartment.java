package org.example.hw1;

public class Apartment {
    private int number;
    private Room[] rooms;

    public Apartment(int number, Room[] rooms) {
        this.number = number;
        this.rooms = rooms;
    }

    public int getNumber() {
        return number;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void print() {
        System.out.println("Квартира номер " + number + " ,количество комнат " + rooms.length);
    }
}
