package kyu_8.stream;

import java.util.stream.IntStream;

public class Grow {
    public static int grow(int[] x) {
       return IntStream.of(x).reduce(1, (a, b) -> a * b);
    }
}
