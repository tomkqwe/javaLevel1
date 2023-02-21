package org.example.generics;

public class PairRunner {
    public static void main(String[] args) {
        Pair<String,Integer> pair = new Pair<>("first",2);
        System.out.println(pair);

        Pair<Integer, String> integerStringPair = PairUtil.swapElements(pair);
        System.out.println(integerStringPair);
    }
}
