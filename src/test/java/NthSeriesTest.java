import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NthSeriesTest {
    @Test
    public void NumberOneTest(){
        //Given
        int n = 1;
        //When
        String result = NthSeries.seriesSum(n);
        //Then
        assertEquals("1,00",result);
    }
    @Test
    public void NumberFiveTest(){
        //Given
        int n = 5;
        //When
        String result = NthSeries.seriesSum(n);
        //Then
        assertEquals("1,57",result);
    }
}
