import java.util.Calendar;
import static java.util.Calendar.*;

public class UnluckyDays {
    public static int unluckyDays(int year) {
        int result = 0;
        Calendar begin = Calendar.getInstance();
        begin.set(year, 0, 1);
        Calendar end = Calendar.getInstance();
        end.set(year, 11, 31);

        while (begin.before(end)) {
            if (begin.get(Calendar.DAY_OF_WEEK) == FRIDAY && begin.get(DAY_OF_MONTH) == 13) {
                result++;
                begin.add(Calendar.DATE, 7);
            } else begin.add(Calendar.DATE, 1);
        }
        return result;
    }
}
