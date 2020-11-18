import java.util.stream.IntStream;

public class ArrayLeaders {
    public static int[] findLeader(int[] array) {
        int[] arrayOfLeaders = new int[]{3};

        for (int i = 0; i < array.length-1; i++) {
            {
                for (int j=i+1;j<array.length-1;j++)
                {
                    if (array[i] > array[j]);
                }
            }
        }
        return arrayOfLeaders;
    }
}

