import java.util.Arrays;

public class MaxDiff {
    public static int maxDiff(int[] array) {
        Arrays.sort(array);
        if (array.length <= 1) return 0;
        else return array[array.length-1]-array[0];
    }
}
