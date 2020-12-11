import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bar {
    public static String hydrate(String drinkString) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(drinkString);
        int result = 0;
        while(matcher.find()){
            result=result+Integer.parseInt(matcher.group());
        }
        if (result<=1)return result + " glass of water";
        else return result + " glasses of water";
    }
}

/*  COMMENTS:

    \d --->          matches the digits --->             http://www.tutorialspoint.com/java/java_regular_expressions.htm

    Stream using:

    public String hydrate(String drinkString) {
        long n = Pattern.compile("[^\\d]+")
                        .splitAsStream(drinkString)
                        .mapToInt( s -> Integer.parseInt(s) )
                        .sum();
        return String.format("%d glass%s of water", n, n==1?"":"es");
    }
*/