package org.example.arrays;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

public class ShiftElements {


    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};


        printArray(shiftElements(shiftElements(array)));
//        Arrays.stream(array).forEach(System.out::println);
    }

    private static void printArray(int[] array) {
        for (int elem : array) {
            System.out.println(elem);
        }
    }

    public static int[] shiftElements(int[] array) {
        int startElement = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i-1];
        }
        array[0] = startElement;
        return array;
    }


}
