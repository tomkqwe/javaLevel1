package org.example.arrays;


import java.util.Arrays;

public class Lineraze {


    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11}, {12}};
        int[] linearaze = linearaze(array);
        System.out.println(Arrays.toString(linearaze));

    }

    private static int[] linearaze(int[][] array) {
        int length = 0;
        for (int[] a : array) {
            length += a.length;
        }
        int[] result = new int[length];
        int index = 0;
        for (int[] a : array) {
            for (int elem : a) {
                result[index++] = elem;
            }
        }
        return result;
    }
}