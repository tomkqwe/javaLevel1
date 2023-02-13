package org.example.arrays.homework;


import java.util.Arrays;

public class BreaksArray {


    public static void main(String[] args) {

        int[] source = {-4, 0, 1, 9, 0, -18, 3};
        int[][] ints = breaksArray(source);
        System.out.println(Arrays.deepToString(ints));
    }

    private static int[][] breaksArray(int[] source) {
        int[] negativeArray = getNegativeArray(source);
        int[] zerosArray = getZerosArray(source);
        int[] positiveArray = getPositiveArray(source);
        int[][] resultArray = getResultArray(negativeArray, zerosArray, positiveArray);
        return resultArray;
    }

    private static int[][] getResultArray(int[] negativeArray, int[] zerosArray, int[] positiveArray) {
        int[][] ints = new int[3][];
        ints[0] = negativeArray;
        ints[1] = zerosArray;
        ints[2] = positiveArray;
        return ints;
    }

    private static int[] getPositiveArray(int[] source) {
        int positiveLength = getPositiveLength(source);
        int[] positiveArr = new int[positiveLength];
        int index = 0;
        for (int elem : source) {
            if (elem > 0) {
                positiveArr[index++] = elem;
            }
        }
        return positiveArr;
    }

    private static int getPositiveLength(int[] source) {
        int result = 0;
        for (int elem : source) {
            if (elem > 0) {
                result++;
            }
        }
        return result;
    }

    private static int[] getZerosArray(int[] source) {
        int zerosLength = getZerosLength(source);
        int[] zerosArr = new int[zerosLength];
        int index = 0;
        for (int elem : source) {
            if (elem == 0) {
                zerosArr[index] = elem;
            }
        }
        return zerosArr;
    }

    private static int getZerosLength(int[] source) {
        int result = 0;
        for (int elem : source) {
            if (elem == 0) {
                result++;
            }
        }
        return result;
    }

    private static int[] getNegativeArray(int[] source) {
        int negativeLength = getNegativeLength(source);
        int[] negativeArr = new int[negativeLength];
        int index = 0;
        for (int elem : source) {
            if (elem < 0) {
                negativeArr[index++] = elem;
            }
        }
        return negativeArr;
    }

    private static int getNegativeLength(int[] source) {
        int result = 0;
        for (int elem : source) {
            if (elem < 0) {
                result++;
            }
        }
        return result;
    }
}
