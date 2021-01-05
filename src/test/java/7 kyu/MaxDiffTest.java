import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaxDiffTest {
    @Test
    public void onlyPositiveTest(){
        System.out.print("Only positive numbers");
        //Given
        int[] array = new int[]{ 1, 2, 3, 4, 5, 5, 4 };
        //When
        int result = MaxDiff.maxDiff(array);
        //Then
        assertEquals("true" ,4,result);
    }
}