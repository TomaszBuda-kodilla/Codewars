package kyu_6;

import java.util.stream.IntStream;

/***********************************************************************************************************************
 * RULES:  - Given an array of integers, find the one that appears an odd number of times.
 *         - There will always be only one integer that appears an odd number of times.
***********************************************************************************************************************/


public class FindTheOddInt {
    public static int findIt(int[] a) {
        int number = 0;
        int[] numbers = IntStream.of(a).sorted().distinct().toArray();
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < a.length; j++)
                if (numbers[i] == a[j]) {
                    result[i]++;
                }
        }
        for (int k = 0; k < result.length; k++) {
            if (result[k] % 2 != 0) {
                number = numbers[k];
            }
        }
        return number;
    }
}
