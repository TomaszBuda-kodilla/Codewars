public class MaximumMultiple {
    public static int maxMultiple(int divisor, int bound) {
        while(bound%divisor != 0){
            bound--;
        }
        System.out.println("The largest multiple of " + divisor + " is : " + bound);
        return bound;
    }
}
