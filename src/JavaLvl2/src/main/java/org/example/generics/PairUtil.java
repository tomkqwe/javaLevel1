package org.example.generics;

public final class PairUtil {
    private PairUtil() {
    }

    public static <K, V> Pair<V, K> swapElements(Pair<K, V> pair) {
        K first = pair.getFirstField();
        V second = pair.getSecondField();

        return new Pair<>(second, first);
    }
}
