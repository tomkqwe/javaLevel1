package org.example.hw2;

public class Palindrome {


    public static void main(String[] args) {
        String source = "шалаш";
        String source1 = "bob";
        String source2 = "bob123321123";
        System.out.println(isPalindrome(source));
        System.out.println(isPalindrome(source1));
        System.out.println(isPalindrome(source2));

    }

    public static boolean isPalindrome(String str) {
        char[] chars = str.toCharArray();
        int index = chars.length / 2;
        String start = getStringFromStart(chars, index);
        String finish = getStringFromFinish(chars, index);
        return start.equals(finish);
    }
    private static String getStringFromStart(char[] chars, int index) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <= index; i++) {
            stringBuilder.append(chars[i]);
        }
        return stringBuilder.toString();
    }

    private static String getStringFromFinish(char[] chars, int index) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = chars.length - 1; i >= index; i--) {
            stringBuilder.append(chars[i]);

        }
        return stringBuilder.toString();
    }


}
