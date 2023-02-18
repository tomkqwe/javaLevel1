package org.example.hw4;

public class Star extends SpaceObject implements Habitable,Roundable,Shineble {

    public Star(String name, double temperature, double weight, double radius) {
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
        return "Star{}";
    }

    @Override
    public boolean isShine() {
        return true;
    }
}
