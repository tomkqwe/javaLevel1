package org.example.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.nio.charset.StandardCharsets.UTF_8;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;

public final class CountCharactersUtil {

    private CountCharactersUtil() {
    }

    public static Map<Character, Integer> countCharacters(Path path) throws IOException {
        try (Stream<String> stringStream = Files.lines(path, UTF_8)) {
            return stringStream.map(String::chars)
                    .flatMapToInt(identity())
                    .mapToObj(a -> (char) a)
                    .filter(Character::isLetter)
                    .map(Character::toLowerCase)
                    .collect(toMap(identity(), it -> 1, Integer::sum));
        }
    }

    public static List<String> toListRepresentation(Map<Character, Integer> map) {
        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .map(entry -> entry.getKey() + " - " + entry.getValue())
                .collect(Collectors.toList());
    }
}
