package org.example.collections.homework2.task2;

import org.example.collections.homework2.task2.enums.Brand;
import org.example.collections.homework2.task2.enums.Color;
import org.example.collections.homework2.task2.enums.Model;

import java.util.Objects;

public class SportCar extends Car {
    private int maxSpeed;

    public SportCar(int year, Brand brand, Model model, Color color, int maxSpeed) {
        super(year, brand, model, color);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SportCar sportCar = (SportCar) o;
        return maxSpeed == sportCar.maxSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxSpeed);
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "maxSpeed=" + maxSpeed +
                '}' + super.toString();
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
