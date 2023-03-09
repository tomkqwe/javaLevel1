package org.example.multithrading.util;

import java.util.Random;

public final class RandomUtil {
    public static final Random RANDOM = new Random();

    private RandomUtil() {
    }
    public static int getNextWithOutZero(int bound){
        return RANDOM.nextInt(bound) + 1;
    }
    public static int getNext(int bound){
        return RANDOM.nextInt(bound);
    }
}
