package org.example.collections.homework2.task2;

import org.example.collections.homework2.task2.enums.Brand;
import org.example.collections.homework2.task2.enums.Color;
import org.example.collections.homework2.task2.enums.Model;

public class CarRunner {

    public static void main(String[] args) {
        Jeep greenToyota = new Jeep(1995, Brand.TOYOTA, Model.JEEP, Color.GREEN, true);
        SportCar classicMerc = new SportCar(2005, Brand.MERCEDES, Model.SEDAN, Color.WHITE, 220);
        Truck gruzovick = new Truck(2015, Brand.NISSAN, Model.CROSSOVER, Color.BLUE, 440);
        Truck gruzovick1 = new Truck(2015, Brand.NISSAN, Model.CROSSOVER, Color.BLUE, 4400);
        Garage garage = new Garage();

        garage.park(greenToyota);
        garage.park(greenToyota);
        garage.park(classicMerc);
        garage.park(gruzovick);
        garage.park(gruzovick1);

        garage.departure(gruzovick1);
        garage.departure(greenToyota);

        int countByBrand = garage.getCountByBrand(Brand.TOYOTA);
        int countByModel = garage.getCountByModel(Model.JEEP);

        System.out.println(garage.toString());

        System.out.println(countByBrand);
        System.out.println(countByModel);
    }
}
