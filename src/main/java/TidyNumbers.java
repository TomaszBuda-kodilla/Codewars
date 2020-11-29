public class TidyNumbers {
    public static boolean tidyNumber(int number) {
        boolean result=true;
        int length = Integer.toString(number).length();
        int[] numberArr = new int[length];
        int counter = 0;
        while (number != 0)
        {
            numberArr[length-1-counter] = number%10;
            number/=10;
            counter++;
        }
        for (int i=0;i<numberArr.length-1;i++) {
            System.out.println(numberArr[i]);
            if (numberArr[i] <= numberArr[i + 1]) {
                result = true;
            } else {result = false; break;}

        }
        System.out.println(result);
    return result;
    }
}
