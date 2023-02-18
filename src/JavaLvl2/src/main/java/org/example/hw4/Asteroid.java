package org.example.hw4;

public class Asteroid extends SpaceObject implements Habitable,Roundable,Shineble {

    public Asteroid(String name, double temperature, double weight, double radius) {
        super(name, temperature, weight, radius);
    }

    @Override
    public boolean isHabitable() {
        return false;
    }

    @Override
    public boolean isRound() {
        return false;
    }

    @Override
    public String toString() {
        return "Asteroid{}";
    }

    @Override
    public boolean isShine() {
        return false;
    }
}
