package org.example.streams.enums;

public enum Grades {

    A(5),
    B(4),
    C(3),
    D(2),
    E(1);

    private int value;

    Grades(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
