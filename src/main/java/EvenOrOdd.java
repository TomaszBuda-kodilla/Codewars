public class EvenOrOdd {
    public static String even_or_odd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        int number1 = 0;
        EvenOrOdd.even_or_odd(number1);
    }
}
