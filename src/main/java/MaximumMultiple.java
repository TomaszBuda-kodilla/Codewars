public class MaximumMultiple {
    public static int maxMultiple(int divisor, int bound) {
        while(bound%divisor != 0){
            bound--;
        }
        return bound;
    }
}
