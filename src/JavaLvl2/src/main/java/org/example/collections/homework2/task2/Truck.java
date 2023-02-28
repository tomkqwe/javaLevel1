package org.example.collections.homework2.task2;

import org.example.collections.homework2.task2.enums.Brand;
import org.example.collections.homework2.task2.enums.Color;
import org.example.collections.homework2.task2.enums.Model;

import java.util.Objects;

public class Truck extends Car {
    private int maxWeight;

    public Truck(int year, Brand brand, Model model, Color color, int maxWeight) {
        super(year, brand, model, color);
        this.maxWeight = maxWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return maxWeight == truck.maxWeight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxWeight);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "maxWeight=" + maxWeight +
                '}'+ super.toString();
    }

    public int getMaxWeight() {
        return maxWeight;
    }
}
