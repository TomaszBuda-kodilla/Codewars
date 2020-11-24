/* RULES: The numbers (a,b) may be positive , negative values or zeros .
Returning value will be an integer .
Java: the following methods are prohibited:
    addExact,
    average,
    collect,
    decrement,
    increment,
    nextAfter,
    nextDown,
    nextUp,
    reduce,
    subtractExact,
    sum,
    summing . The following classes are prohibited: BigDecimal and BigInteger .*/
public class SumOf {
    public static int sum(int a, int b) {
        int result = 0;
        while (b != 0) {
            result = a & b;
            a = a ^ b;
            b = result << 1;
        }
        return a;
    }
}
