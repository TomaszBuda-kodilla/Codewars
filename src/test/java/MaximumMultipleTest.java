import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumMultipleTest {
    @Test
    public void smallPositivesTest() {
        //Given
        int divisor = 2;
        int bound = 200;
        //When
        int result = MaximumMultiple.maxMultiple(divisor,bound);
        //Then
        assertEquals(200,result);
    }
    @Test
    public void largePositivesTest() {
        //Given
        int divisor = 37;
        int bound = 200;
        //When
        int result = MaximumMultiple.maxMultiple(divisor,bound);
        //Then
        assertEquals(185,result);
    }
}
