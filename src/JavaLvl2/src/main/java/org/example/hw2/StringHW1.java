package org.example.hw2;

/**
 * Дана строка.
 * Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом. Также удалить пробелы.
 * Результат привести к верхнему регистру.
 * Например:
 * "abc Cpddd Dio OsfWw" -> "ABCPDIOSFW"
 */
public class StringHW1 {

    public static void main(String[] args) {
        String source = "abc Cpddd Dio OsfWw";
        String upperCase = makeUpperCase(source);
        String upperNoSpaces = deleteSpaces(upperCase);
        String result = deleteDuplicateSchars(upperNoSpaces);
        System.out.println(result);
    }

    private static String deleteDuplicateSchars(String upperNoSpaces) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < upperNoSpaces.length(); i++) {
            char c = upperNoSpaces.charAt(i);
            int index = upperNoSpaces.indexOf(c, i+1);
            if (index == -1) {
                builder.append(c);
            }
        }
        return builder.toString();
    }

    private static String deleteSpaces(String upperCase) {
        return upperCase.replace(" ", "");
    }

    private static String makeUpperCase(String source) {
        return source.toUpperCase();
    }


}
