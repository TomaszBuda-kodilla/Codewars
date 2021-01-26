package kyu_6;

import java.util.stream.IntStream;

public class FindTheOddInt {
    public static int findIt(int[] a) {
        int[] numbers = IntStream.of(a).sorted().distinct().toArray();
        int[] counter = new int[numbers.length];
        //for (int i=0;i< ;i++){
        //}
        return 1;
    }
}
