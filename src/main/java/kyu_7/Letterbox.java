package kyu_7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Letterbox {
    public static int[] paintLetterboxes(final int start, final int end) {
        int[] result = new int[10];
        String[] numbers = new String[end - start + 1];
        String number = "";

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = String.valueOf(start + i);
        }
        number = Arrays.stream(numbers).collect(Collectors.joining(""));

        for (int j = 0; j < number.length(); j++) {
            for (int k = 0; k < 10; k++) {
                if ((int)number.charAt(j)-48 == k) {
                    result[k]++;
                }
            }
        }
        return result;
    }
}
