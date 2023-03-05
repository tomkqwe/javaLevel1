package org.example.io.hw;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public final class CsvParserUtil {

    public static final String ID_NAME_PRICE = "ID,NAME,PRICE";

    private CsvParserUtil() {
    }

    public static List<String> readCsvToList(Path path) throws IOException {
        List<String> firstCsvModels;
        try (Stream<String> lines = Files.lines(path)) {
            firstCsvModels = lines
                    .skip(1)
                    .map(s -> {
                        String[] split = s.split(",");
                        return split[0] + "," + split[1];
                    }).toList();
        }
        return firstCsvModels;
    }

    public static List<String> joinCsvOnId(List<String> firstList, List<String> secondList) {
        Iterator<String> firstIter = firstList.iterator();
        Iterator<String> secondIter = secondList.iterator();
        List<String> resultList = new ArrayList<>();
        resultList.add(ID_NAME_PRICE);
        while (firstIter.hasNext() && secondIter.hasNext()) {
            String first = firstIter.next();
            String second = secondIter.next();
            if (getId(first).equals(getId(second))){
                String resultString = String.format("%s,%s", second, first.split(",")[1]);
                resultList.add(resultString);
            }
        }
        return resultList;
    }

    private static String getId(String first) {
        return first.split(",")[0];
    }
}
