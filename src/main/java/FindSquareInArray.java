import java.util.Arrays;

public class FindSquareInArray {
    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null) return false;
        if (a.length != b.length) return false;
        int[] aSort = Arrays.stream(a).map(i -> i * i).sorted().toArray();
        int[] bSort = Arrays.stream(b).sorted().toArray();
        return Arrays.equals(aSort, bSort);
    }
}
