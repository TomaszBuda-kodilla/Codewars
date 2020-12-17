import org.junit.Test;

import static org.junit.Assert.*;

public class FindSquareInArrayTest {
    @Test
    public void positiveTest() {
        //Given
        int[] a = {11, 144, 19, 161, 19, 144, 19, 121,0};
        int[] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361,0};
        //When
        boolean result = FindSquareInArray.comp(a, b);
        //Then
        assertEquals(true,result);
    }

    @Test
    public void negativeTest() {
        //Given
        int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = {121, 14641, 20736, 361, 25921, 361, 20736, 31};
        //When
        boolean result = FindSquareInArray.comp(a, b);
        //Then
        assertEquals(false,result);
    }
}