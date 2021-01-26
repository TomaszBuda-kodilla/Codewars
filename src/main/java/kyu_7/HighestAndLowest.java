package kyu_7;

import java.util.Arrays;

public class HighestAndLowest {
    public static String highAndLow(String numbers){
        String[] array = numbers.split(" ");
        int[] result = new int[array.length];
        for(int i=0;i< array.length;i++){
            result[i] = Integer.parseInt(array[i]);
        }
        Arrays.sort(result);
        return result[result.length-1] + " " + result[0];
    }
}

