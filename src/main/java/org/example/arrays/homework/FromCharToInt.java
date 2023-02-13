package org.example.arrays.homework;


public class FromCharToInt {


    public static void main(String[] args) {
        char[] source = {'a', '6', 'y', 'P', 'T', 'q', '9', '+'};
        int[] intsArr = fromCharToInt(source);
        int avg = calculateAvg(intsArr);
        printArr(intsArr,avg);
    }

    private static void printArr(int[] intsArr, int avg) {
        for (int elem: intsArr){
            if (elem > avg){
                System.out.println(elem);
            }
        }
    }

    private static int calculateAvg(int[] intsArr) {
        int sum = 0;
        for (int elem : intsArr) {
            sum += elem;
        }
        return sum / intsArr.length;
    }

    private static int[] fromCharToInt(char[] source) {
        int[] result = new int[source.length];
        for (int i = 0; i < source.length; i++) {
            result[i] = source[i];
        }
        return result;
    }
}
