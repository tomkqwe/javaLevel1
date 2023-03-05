package org.example.io.hw;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.TRUNCATE_EXISTING;
import static org.example.io.hw.CsvParserUtil.*;


public class CsvParserRunner {
    public static void main(String[] args) throws IOException {
        Path firstCsv = Path.of("src", "JavaLvl2", "src", "main", "resources", "items-price.csv");
        Path secondCsv = Path.of("src", "JavaLvl2", "src", "main", "resources", "items-name.csv");

        Path resultCsvPath = Path.of("src", "JavaLvl2", "src", "main", "resources", "result.csv");


        List<String> firstCsvModels = readCsvToList(firstCsv);
        List<String> secondCsvModels = readCsvToList(secondCsv);
        List<String> listToWrite = joinCsvOnId(firstCsvModels, secondCsvModels);

        Files.write(resultCsvPath, listToWrite, CREATE, TRUNCATE_EXISTING);

        System.out.println(listToWrite);

    }
}
