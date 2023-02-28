package org.example.collections.homework2.task2;

import org.example.collections.homework2.task2.enums.Brand;
import org.example.collections.homework2.task2.enums.Model;

import java.util.HashMap;
import java.util.Map;

public class Garage {
    private final HashMap<Car, Integer> map = new HashMap<>();

    public void park(Car car) {
        int getValue = map.getOrDefault(car, 0);
        map.put(car, getValue + 1);
    }

    public void departure(Car car) {
        int oldCount = map.getOrDefault(car, 0);
        int newCount = oldCount == 0 ? 0 : oldCount - 1;
        map.put(car, newCount);
    }

    public int getCountByBrand(Brand brand) {
        int result = 0;
        for (Map.Entry<Car, Integer> entry : map.entrySet()) {
            if (entry.getKey().getBrand() == brand) {
                result += entry.getValue();
            }
        }
        return result;
    }

    public int getCountByModel(Model model) {
        int result = 0;
        for (Map.Entry<Car, Integer> entry : map.entrySet()) {
            if (entry.getKey().getModel() == model) {
                result += entry.getValue();
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "map=" + map +
                '}';
    }
}
