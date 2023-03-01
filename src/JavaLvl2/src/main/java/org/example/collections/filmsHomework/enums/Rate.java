package org.example.collections.filmsHomework.enums;

public enum Rate {
    D(2),
    C(3),
    B(4),
    A(5);
    private int value;

    Rate(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
