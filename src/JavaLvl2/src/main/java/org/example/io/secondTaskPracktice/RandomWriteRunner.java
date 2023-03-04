package org.example.io.secondTaskPracktice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.TRUNCATE_EXISTING;
import static org.example.io.secondTaskPracktice.RandomWriteUtil.generateRandomValues;

public class RandomWriteRunner {
    public static void main(String[] args) throws IOException {
        Path resultPath = Path.of("src", "JavaLvl2", "src", "main", "resources", "task2_result.txt");
        List<String> strings = generateRandomValues(100);
        List<String> readSorted = DigitHelper.readSorted(resultPath);
        Files.write(resultPath, strings, CREATE, TRUNCATE_EXISTING);
        Files.write(resultPath, readSorted, TRUNCATE_EXISTING);


    }
}
