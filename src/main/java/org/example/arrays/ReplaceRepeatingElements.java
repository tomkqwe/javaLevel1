package org.example.arrays;


public class ReplaceRepeatingElements {


    public static void main(String[] args) {
        int[] exampleArray = {1, 1, 2, 3, 4, 5, 6, 1, 1, 1, 6, 7, 3};
        printArray(replaceRepeatingElements(exampleArray));

    }

    private static void printArray(int[] exampleArray) {
        for (int elem : exampleArray) {
            System.out.println(elem);
        }
    }

    public static int[] replaceRepeatingElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) continue;
            boolean isRepeating = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = 0;
                    isRepeating = true;
                }

            }
            if (isRepeating) arr[i] = 0;
        }
        return arr;
    }


}
