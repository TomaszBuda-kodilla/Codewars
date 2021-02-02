package kyu_5;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WeightForWeight {
    public static String orderWeight(String word) {
        return Stream.of(word.trim().split(" +"))
                .sorted()
                .sorted(Comparator.comparingInt(o -> o.chars().map(Character::getNumericValue).sum()))
                .collect(Collectors.joining(" "));
    }
}
