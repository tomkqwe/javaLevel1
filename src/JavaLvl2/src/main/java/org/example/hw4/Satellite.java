package org.example.hw4;

public class Satellite extends SpaceObject implements Habitable,Roundable,Shineble {
    public Satellite(String name, double temperature, double weight, double radius) {
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
        return "Satellite{}";
    }

    @Override
    public boolean isShine() {
        return true;
    }
}
