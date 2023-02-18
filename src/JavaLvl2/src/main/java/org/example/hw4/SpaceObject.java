package org.example.hw4;

public abstract class SpaceObject {
    private final String name;
    private final double temperature;
    private final double weight;
    private final double radius;

    public SpaceObject(String name, double temperature, double weight, double radius) {
        this.name = name;
        this.temperature = temperature;
        this.weight = weight;
        this.radius = radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public int compareWeight(SpaceObject spaceObject1) {
        return this.weight > spaceObject1.weight ? 1 : -1;
    }

    public String getName() {
        return name;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getWeight() {
        return weight;
    }

    public double getRadius() {
        return radius;
    }
}
