import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FourSevenTest {
    @Test
    public void fourTest() {
        //Given
        int a = 4;
        //When
        int result = FourSeven.fourSeven(a);
        //Then
        assertEquals(7,result);
    }
    @Test
    public void sevenTest() {
        //Given
        int a = 7;
        //When
        int result = FourSeven.fourSeven(a);
        //Then
        assertEquals(4,result);
    }
    @Test
    public void otherNumberTest() {
        //Given
        int a = 6;
        //When
        int result = FourSeven.fourSeven(a);
        //Then
        assertEquals(0,result);
    }
}