import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestProductTest {
    @Test
    public void TenNumbers(){
        //Given
        String number = "9999253265";
        //When
        int result = LargestProduct.solution(number);
        //Then
        assertEquals(6561,result);
    }
}