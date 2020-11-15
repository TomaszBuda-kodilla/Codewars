public class SquareNSum {
    public static void main(String[] args) {
        int[] sqr = new int[] {1,2,2};
        SquareNSum.squareSum(sqr);
    }

    private static int squareSum(int[] sqr) {
        double result = 0;
        for(int i=0;i<sqr.length;i++){
            result = result + Math.pow(sqr[i],2);
        }
        System.out.println("Result = " + result);
        int value = (int)result;
        return value;
    }
}



