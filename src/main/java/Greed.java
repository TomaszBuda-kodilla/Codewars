import java.util.Arrays;
import java.util.HashMap;

public class Greed {
    public static int diceThrow(int[] numbers) {
        int result = 0,number=0;
        HashMap<Integer,Integer> counters = new HashMap<Integer, Integer>();
        for (int i=1;i<7;i++){
                counters.put(i,0);
        }
        for (int j=0;j<numbers.length;j++)
        {
            counters.put(numbers[j],counters.get(numbers[j])+1);
        }
        if (counters.containsKey(1) && counters.containsValue(3))
        {
            result+=1000;
        } else if (counters.containsKey(1) && counters.containsValue(4))
        {
            result+=1100;
        } else if (counters.containsKey(1) && counters.containsValue(5))
        {
            result+=1200;
        }
        System.out.println(counters);
        /*int result = 0, duplicate = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j])
                {
                    duplicate+=1;
                }
                if (numbers[i] == 1 && duplicate<3) {
                    result += 100;
                } else if (numbers[i] == 1 && duplicate == 3)
                {

                }
            }
        }*/
        return result;
    }
}
