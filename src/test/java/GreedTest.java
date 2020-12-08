import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreedTest {
    /*@Test
    public void withoutTriplesTest(){
        //Given
        int[] numbers = new int[]{1,2,1,5,6};
        //When
        int result = Greed.diceThrow(numbers);
        //Then
        assertEquals(250,result);
    }*/
    @Test
    public void withTriplesTest(){
        //Given
        int[] ones = new int[]{1,1,1,1,1};
        //int[] fours = new int[]{4,3,3,4,4};
        //When
        int resultOnes = Greed.diceThrow(ones);
        //int resultFours = Greed.diceThrow(fours);
        //Then
        assertEquals(1200,resultOnes);
        //assertEquals(400,resultFours);
    }
}
