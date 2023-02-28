package org.example.collections.homework1;

import java.util.Comparator;

public class QuantityNameComparator implements Comparator<Chat> {
    @Override
    public int compare(Chat o1, Chat o2) {
        int i = o2.getQuantity() - o1.getQuantity();
        if (i == 0) {
            return o1.getName().compareTo(o2.getName());
        }else {
            return i;
        }
    }
}
