package kyu_7;

import java.util.Arrays;

/***********************************************************************************************************************
 * RULES:   - Write a method, that gets an array of integer-numbers and return an array of the averages of each
 *          integer-number and his follower
 *          - If the array has 0 or 1 values or is null, your method should return an empty array.
 **********************************************************************************************************************/

public class AveragePlusNext {
    public static double[] averages(int[] numbers) {
        if (Arrays.asList(numbers).contains(null)) return new double[]{};
        else if (numbers.length <= 1) return new double[]{};
        else {
            double[] result = new double[(numbers.length - 1)];
            for (int i = 0; i < result.length; i++) {
                result[i] = (double) (numbers[i] + numbers[i + 1]) / 2;
            }
            return result;
        }
    }
}
