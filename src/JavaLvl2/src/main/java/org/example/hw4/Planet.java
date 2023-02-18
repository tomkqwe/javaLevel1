package org.example.hw4;

public class Planet extends SpaceObject implements Habitable,Roundable,Shineble {

    public Planet(String name, double temperature, double weight, double radius) {
        super(name, temperature, weight, radius);
    }


    @Override
    public boolean isHabitable() {
        if (getName().equals("Earth")) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isRound() {
        return true;
    }

    @Override
    public String toString() {
        return "Planet{}";
    }

    @Override
    public boolean isShine() {
        return false;
    }
}

