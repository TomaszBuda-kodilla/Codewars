import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnluckyDaysTest {
    @Test
    public void oneDayTest() {
        //Given
        int year = 1986;
        //When
        int result = UnluckyDays.unluckyDays(year);
        //Then
        assertEquals(1, result);
    }
    @Test
    public void threeDaysTest() {
        //Given
        int year = 2015;
        //When
        int result = UnluckyDays.unluckyDays(year);
        //Then
        assertEquals(3, result);
    }
}