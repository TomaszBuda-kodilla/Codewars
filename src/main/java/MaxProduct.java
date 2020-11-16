public class MaxProduct {
    public static int adjacentElementsProduct(int[] array) {
        int result=-2147483648;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] * (array[i + 1]) > result) {
                result = array[i] * array[i + 1];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = new int[]{-23, 4, -5, 99, -27, 329, -2, 7, -921};
        MaxProduct.adjacentElementsProduct(array);
    }
}
