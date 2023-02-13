package org.example.arrays.homework;


import java.util.Arrays;

public class DeleteNegativeNumbers {


    public static void main(String[] args) {
        int[] array = {3, 5, -6, 3, 2, -9, 0, -123};
        int length = countLength(array);
        int[] positveArray = createPositveArray(length, array);
        int[] result = multiplyElements(positveArray);
        System.out.println(Arrays.toString(result));


    }

    private static int[] multiplyElements(int[] positveArray) {
        for (int i = 0; i < positveArray.length; i++) {
            positveArray[i] *= positveArray.length;
        }
        return positveArray;
    }

    private static int[] createPositveArray(int length, int[] array) {
        int[] resultArray = new int[length];
        int index = 0;
        for (int a : array) {
            if (a >= 0) {
                resultArray[index++] = a;
            }
        }
        return resultArray;
    }

    private static int countLength(int[] array) {
        int result = 0;
        for (int a : array) {
            if (a >= 0) {
                result++;
            }
        }
        return result;
    }
}
