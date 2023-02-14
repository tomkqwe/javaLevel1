package org.example.hw1;

public class Room {
    private boolean isPassage;

    public boolean isPassage() {
        return isPassage;
    }

    public Room(boolean isPassage) {
        this.isPassage = isPassage;
    }

    public void print() {
        System.out.println("Комната проходная: " + isPassage);
    }
}
