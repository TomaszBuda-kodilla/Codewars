
public class MultiplesOfThreeAndFive {
    public static int solution(int number) {
        int result = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                result += i;
            }
        }
        return result;
    }
}

/* Stream

public int solution(int number) {
    return IntStream.range(0, number)
                    .filter(n -> (n % 3 == 0) || (n % 5 == 0))
                    .sum();
  }

* */
