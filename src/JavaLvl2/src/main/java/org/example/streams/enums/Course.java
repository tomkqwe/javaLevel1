package org.example.streams.enums;

public enum Course {
    FIRST(1),
    SECOND(2),
    THIRD(3),
    FOURTH(4);
    private int value;

    Course(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
