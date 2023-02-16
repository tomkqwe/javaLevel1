package org.example.hw2;

import java.util.Arrays;

/**
 * Дана строка с текстом, в котором есть цифры от 0 до 9.
 * Написать 2 метода:
 * - возвращающий массив цифр из переданной строки
 * - возвращающий сумму цифр из переданного целочисленного массива
 * Посчитать сумму всех чисел из строки
 * Например:
 * “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */
public class StringHW2 {

    public static void main(String[] args) {
        String source = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";
        int[] numsArray = getNumsArray(source);
        int sumFromArray = getSumFromArray(numsArray);

        System.out.println(Arrays.toString(numsArray));
        System.out.println(sumFromArray);
    }

    private static int getSumFromArray(int[] numsArray) {
        int sum = 0;
        for (int i : numsArray) {
            sum += i;
        }
        return sum;
    }

    private static int[] getNumsArray(String source) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            char c = source.charAt(i);
            if (Character.isDigit(c)) {
                builder.append(c);
            }
        }
        int[] result = new int[builder.length()];
        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(builder.charAt(i) + "");
        }
        return result;
    }

}
