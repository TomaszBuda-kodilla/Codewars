import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfTest {
    @Test
    public void checkPositiveValues() {
        //Given
        int a = 1;
        int b = 2;
        //When
        int result = SumOf.sum(a, b);
        //Then
        assertEquals(3, result);
    }

    @Test
    public void checkNegativeValues() {
        //Given
        int a = -20, b = -10;
        //When
        int result = SumOf.sum(a,b);
        //Then
        assertEquals(-30,result);
    }

    @Test
    public void checkMixtureValues() {
        //Given
        int a = -10, b = 10;
        //When
        int result = SumOf.sum(a,b);
        //Then
        assertEquals(0,result);
    }
}
