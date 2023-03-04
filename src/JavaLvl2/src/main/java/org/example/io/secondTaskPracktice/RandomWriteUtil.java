package org.example.io.secondTaskPracktice;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public final class RandomWriteUtil {

    public static final int DEFAULT_BOUND = 1000;
    public static final Random RANDOM = new Random();

    private RandomWriteUtil() {
    }

    public static int getRandomValue() {
        return getRandomValue(DEFAULT_BOUND);
    }

    public static int getRandomValue(int value) {
        return RANDOM.nextInt(value);
    }

    public static List<String> generateRandomValues(int limit) {
        return IntStream.iterate(0, a -> a + 1)
                .limit(limit)
                .map(it -> getRandomValue())
                .mapToObj(String::valueOf)
                .collect(Collectors.toList());
    }


}
