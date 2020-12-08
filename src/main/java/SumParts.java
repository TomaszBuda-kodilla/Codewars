import java.util.*;
import java.util.stream.IntStream;

public class SumParts {
    public static int[] sumParts(int[] ls) {
        LinkedList linkedList = new LinkedList();
        int result = IntStream.of(ls).sum();
        linkedList.add(result);
        for (int j = 1; j < ls.length; j++) {
            linkedList.add(result - ls[j - 1]);
            result -= ls[j - 1];
        }
        if (ls.length > 0) linkedList.add(0);
        Object[] objectArray = linkedList.toArray();
        int[] intsArray = new int[objectArray.length];
        for (int i = 0; i < objectArray.length; i++) {
            intsArray[i] = (int) objectArray[i];
        }
        return intsArray;
    }
}

/* Other example of this method using stream

public static int[] sumParts(int[] ls) {
        int[] result = new int[ls.length + 1];
        int sum = Arrays.stream(ls).sum();
        for (int i = 0; i<ls.length;i++){
            result[i] = sum;
            sum = sum - ls[i];
        }
        return result;
    }
 */
