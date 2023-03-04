package org.example.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.TRUNCATE_EXISTING;
import static org.example.io.CountCharactersUtil.countCharacters;
import static org.example.io.CountCharactersUtil.toListRepresentation;

public class CountCharactersRunner {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src", "JavaLvl2", "src", "main", "resources", "testtestFile.txt");
        Map<Character, Integer> characterIntegerMap = countCharacters(path);
        List<String> strings = toListRepresentation(characterIntegerMap);

        Path writePath = Path.of("src", "JavaLvl2", "src", "main", "resources", "task1_result.txt");
        Files.write(writePath, strings, CREATE, TRUNCATE_EXISTING);

        System.out.println(strings);

    }
}
