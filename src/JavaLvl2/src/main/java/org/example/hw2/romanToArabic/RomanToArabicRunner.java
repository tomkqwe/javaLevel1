package org.example.hw2.romanToArabic;


public class RomanToArabicRunner {

    public static void main(String[] args) {
        String source = "VI";
        int result = correctConvert(source);
        System.out.println(result);
    }

    private static int getConvertToArabic(char aChar) {
        return new Roman(aChar).convertToArabic();
    }

    public static int correctConvert(String romans) {
        char[] chars = romans.toCharArray();
        int result = 0;
        boolean takePairOfChars = false;
        for (int i = 0; i < chars.length; i++) {
            int index = i;
            if (++index >= chars.length) {
                if (!takePairOfChars){
                    result += getConvertToArabic(chars[i]);
                }
                continue;
            }
            if (isNextCharIsLargest(chars[i], chars[index])) {
                result += minusSmallestBeforeLargest(chars[i], chars[index]);
                takePairOfChars = true;
            } else {
                result += getConvertToArabic(chars[i]);
            }
        }
        return result;
    }

    public static int minusSmallestBeforeLargest(char smallest, char largest) {
        return getConvertToArabic(largest) - getConvertToArabic(smallest);
    }

    public static boolean isNextCharIsLargest(char smallest, char largest) {
        return getConvertToArabic(smallest) < getConvertToArabic(largest);
    }


}
