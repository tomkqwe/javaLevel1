package org.example.collections.homework2.task2;

import org.example.collections.homework2.task2.enums.Brand;
import org.example.collections.homework2.task2.enums.Color;
import org.example.collections.homework2.task2.enums.Model;

import java.util.Objects;

public class Jeep extends Car {
    private boolean fourWheelDrive;

    public Jeep(int year, Brand brand, Model model, Color color, boolean fourWheelDrive) {
        super(year, brand, model, color);
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Jeep jeep = (Jeep) o;
        return fourWheelDrive == jeep.fourWheelDrive;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fourWheelDrive);
    }

    @Override
    public String toString() {
        return "Jeep{" +
                "fourWheelDrive=" + fourWheelDrive +
                '}' + super.toString();
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }
}
