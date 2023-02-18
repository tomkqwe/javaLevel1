package org.example.hw4;

public class SpaceUtils {
    private SpaceUtils() {
    }
    public static double powerOfGravitation(SpaceObject object1, SpaceObject object2){
        return (object1.getDiameter() / object2.getDiameter()) * 1000_000;
    }
    public static boolean isStar(SpaceObject spaceObject){
        return  spaceObject instanceof Star;
    }
}
