package org.example.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MarkLength4 {


    public static void main(String[] args) {
        String[] strings = {"this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"};
        List<String> list = addStringsToList(strings);
        List<String> result = markLength4(list);
        System.out.println(result);
    }

    public static List<String> markLength4(List<String> list) {
        ArrayList<String> result = new ArrayList<>();
        for (String elem : list) {
            if (elem.length() == 4) {
                result.add("****");
            }
            result.add(elem);
        }
        return result;
    }

    public static List<String> addStringsToList(String[] elems) {
        return new ArrayList<>(Arrays.asList(elems));
    }

}
