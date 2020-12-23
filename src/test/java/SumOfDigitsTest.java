import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SumOfDigitsTest {

    @Test
    public void oneStepNumberTest() {
        //Given
        int number = 123;
        //When
        int result = SumOfDigits.digital_root(number);
        //Then
        assertEquals(6, result);
    }

    @Test
    public void twoStepsNumberTest() {
        //Given
        int number = 942;
        //When
        int result = SumOfDigits.digital_root(number);
        //Then
        assertEquals(6, result);
    }

    @Test
    public void threeStepsNumberTest() {
        //Given
        int number = 493193;
        //When
        int result = SumOfDigits.digital_root(number);
        //Then
        assertEquals(2, result);
    }

    @Test
    public void negativeNumberTest() {
        //Given
        int number = -100;
        //When
        int result = SumOfDigits.digital_root(number);
        //Then
        assertEquals(-1, result);
    }
}