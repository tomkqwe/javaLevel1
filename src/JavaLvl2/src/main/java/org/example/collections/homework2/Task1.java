package org.example.collections.homework2;

import java.util.HashMap;
import java.util.Map;

/**
 * Задан текст на английском языке.
 * Выделить все различные слова.
 * Для каждого слова подсчитать частоту его встречаемости.
 * Слова, отличающиеся регистром букв, считать различными.
 **/
public class Task1 {
    public static void main(String[] args) {
        String source = "ArrayList resides within Java Core Libraries, so you don't need any additional libraries. In order to use it just add the following import statement:" +
                "In this article, we're going to take a look at ArrayList class from the Java Collections Framework. We'll discuss its properties, common use cases, as well as its advantages and disadvantages.";

        String s = "hello Hello hello my my my my friend stupid morron";
        Map<String, Integer> stringIntegerMap = countWords(s);
        System.out.println(stringIntegerMap);
    }

    public static Map<String, Integer> countWords(String source) {
        String[] split = source.split(" ");
        HashMap<String, Integer> result = new HashMap<>();
        for (String s : split) {
            if (result.containsKey(s)) {
                result.put(s, result.get(s) + 1);
            } else {
                result.put(s, 1);
            }
        }
        return result;
    }
}
