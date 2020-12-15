import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class DivSevenTest{
    @Test
    public void oneStepTest(){
        //Given
        int number = 371;
        //When
        long[] result = DivSeven.seven(number);
        //Then
        assertArrayEquals(new long[] {35,1},result);
    }
    @Test
    public void twoStepsTest(){
        //Given
        int number = 1603;
        //When
        long[] result = DivSeven.seven(number);
        //Then
        assertArrayEquals(new long[] {7,2},result);
    }
    @Test
    public void sevenStepsTest(){
        //Given
        int number = 477557101;
        //When
        long[] result = DivSeven.seven(number);
        //Then
        assertArrayEquals(new long[] {28,7},result);
    }
}