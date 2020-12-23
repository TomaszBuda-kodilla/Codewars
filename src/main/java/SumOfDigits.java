
public class SumOfDigits {
    public static int digital_root(int n) {
        int result = 0;
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = n % 10;
            n /= 10;
            result += array[i];
        }
        if (result > 9) {
            return digital_root(result);
        } else return result;
    }
}

/*  Mathematics solution
  public static int digital_root(int n) {
    return (1 + (n - 1) % 9);
  }
 */