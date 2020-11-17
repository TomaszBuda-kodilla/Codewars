public class Solution {
    public static int[] increment(int[] array) {
        int[] newArray = new int[array.length + 1];

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != 9) {
                array[i] += 1;
                return array;
            } else {
                array[i] = 0;
            }
        }
        newArray[0] = 1;
        return newArray;
    }

    public static void main(String[] args) {
        int[] array = new int[]{8, 9, 9};
        Solution.increment(array);
    }
}

