import jdk.jshell.EvalException;

public class NthSeries {
    public static String seriesSum(int n) {
        int range = 1, value =1;
        double sum = 1;
        if (n>1){
            while ( range != n)
            {
                sum = sum+(1d/(value+3));
                value+=3;
                range++;
            }
        } else if(n == 0) sum = 0;
        return String.format("%.2f", sum);
    }
}
