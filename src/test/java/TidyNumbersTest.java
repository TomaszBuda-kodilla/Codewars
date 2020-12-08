import org.junit.Test;
import static org.junit.Assert.*;

public class TidyNumbersTest {
    @Test
    public void onlyGoodNumbersTest(){
        //Given
        int number1 = 12;
        int number2 = 13579;
        int number3 = 124;
        //Then
        boolean result1 = TidyNumbers.tidyNumber(number1);
        boolean result2 = TidyNumbers.tidyNumber(number2);
        boolean result3 = TidyNumbers.tidyNumber(number3);
        //Then
        assertTrue(result1);
        assertTrue(result2);
        assertTrue(result3);
    }
    @Test
    public void onlyBadNumberTest(){
        //Given
        int number1 = 32;
        int number2 = 1024;
        int number3 = 12576;
        //Then
        boolean result1 = TidyNumbers.tidyNumber(number1);
        boolean result2 = TidyNumbers.tidyNumber(number2);
        boolean result3 = TidyNumbers.tidyNumber(number3);
        //Then
        assertFalse(result1);
        assertFalse(result2);
        assertFalse(result3);
    }
}
