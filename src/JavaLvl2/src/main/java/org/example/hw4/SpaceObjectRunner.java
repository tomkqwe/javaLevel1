package org.example.hw4;

public class SpaceObjectRunner {
    public static void main(String[] args) {
        Habitable earth = new Planet("Earth",30.0,5.9742,20.05);
        boolean habitable = earth.isHabitable();
        System.out.println(habitable);

        SpaceObject object1 = new Satellite("Moon",-30.0,1.12345,13.3);
        SpaceObject object2 = new Asteroid("Rocky",500,0.8765,10.5);
        SpaceObject object3 = new Star("Sirius",10000,4.2323,45.5);
        SpaceObject object4 = new Planet("Mars",45,2.34,30);
        System.out.println(object4.getDiameter());
        System.out.println(object3.compareWeight(object1));
        System.out.println(SpaceUtils.powerOfGravitation(object1,object2));
        System.out.println(SpaceUtils.isStar(object3));
    }
}
