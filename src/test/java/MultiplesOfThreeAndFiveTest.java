import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplesOfThreeAndFiveTest {
    @Test
    public void smallNumber(){
        //Given
        int number = 6;
        //When
        int result = MultiplesOfThreeAndFive.solution(number);
        //Then
        assertEquals(14,result);
    }
    @Test
    public void BigNumber(){
        //Given
        int number = 10;
        //When
        int result = MultiplesOfThreeAndFive.solution(number);
        //Then
        assertEquals(33,result);
    }
}
