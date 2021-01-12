import java.util.Arrays;

public class Stanton {
    public static int stantonMeasure(int[] arr) {
        int n = (int) Arrays.stream(arr).filter(e -> e == 1).count();
        return (int) Arrays.stream(arr).filter(e -> e == n).count();
    }
}
