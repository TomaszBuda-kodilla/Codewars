import java.util.Arrays;

public class Poet {
    public static int[] pandulum(int[] values) {
        Arrays.sort(values);
        int[] music = new int[values.length];
        int middle = 0;
        if (values.length % 2 == 0) {
            middle = values.length / 2 - 1;
        } else middle = values.length / 2;
        int counter = middle;
        for (int i = 0; i < values.length; i++) {
            if (i % 2 == 0) {
                music[counter] = values[i];
                counter--;
            } else {
                music[middle + 1] = values[i];
                middle++;
            }
        }
        return music;
    }
}
