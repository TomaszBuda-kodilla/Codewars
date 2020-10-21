import java.util.*;

public class SumParts {
    public static int[] sumParts(int[] ls) {
        int[] newTab = new int[ls.length + 1];
        for (int i = 0; i < newTab.length; i++) {
            for (int j = 0; j < ls.length; j++) {
                newTab[i] = newTab[i] + ls[j];
            }
            if (i >= ls.length) {
                newTab[i] = 0;
            } else {
                ls[i] = 0;
            }
        }
        System.out.println("Elements of array:" + Arrays.toString(newTab));
        return newTab;
    }

    public static void main(String[] args) {
        int[] tab = new int[]{2, 4, 6, 8, 10};
        SumParts.sumParts(tab);
    }
}
