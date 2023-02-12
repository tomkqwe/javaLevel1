package org.example.arrays;


import java.util.Arrays;

public class MergeArrays {


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 777};
        int[] arr2 = {5, 6, 7, 12, 32, 45, 678, 989, 1989};
        int length = arr1.length + arr2.length;
        int[] resultArr = new int[length];
        int[] mergeArrays = mergeArrays(arr1, arr2, resultArr);
        printArray(mergeArrays);

    }

    private static void printArray(int[] mergeArrays) {
        Arrays.stream(mergeArrays).forEach(System.out::println);
    }

    private static int[] mergeArrays(int[] arr1, int[] arr2, int[] resultArr) {
        int index = 0;
        for (int i = 0; i < resultArr.length; i++) {
            if (arr1.length > index && arr2.length > index) {
                if (i % 2 == 0) {
                    resultArr[i] = arr1[index];
                }
                if (i % 2 == 1) {
                    resultArr[i] = arr2[index];
                    index++;
                }
            } else if (arr1.length > index) {
                resultArr[i] = arr1[index];
                index++;
            } else if (arr2.length > index) {
                resultArr[i] = arr2[index];
                index++;
            }

        }
        return resultArr;
    }
}
