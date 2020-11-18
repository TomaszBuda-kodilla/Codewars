import org.junit.Assert;
import org.junit.Test;

public class SmallestNumberTest {
    @Test
    public void OnlyPositive()
    {
        //Given
        int[] array = {7,200,1000,999,1000};
        //When
        int result = SmallestNumber.solution(array);
        //Then
        Assert.assertEquals(7,result);
    }

}
