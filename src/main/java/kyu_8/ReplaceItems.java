package kyu_8;

import java.util.Arrays;
import java.util.Collections;

public class ReplaceItems {
    public static String[] replaceItems(String[] arr) {
        Collections.reverse(Arrays.asList(arr));
        return arr;
    }
}
