import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaxDiffTest {
    @Test
    public void onlyPositiveTest(){
        //Given
        int[] array = new int[]{ 1, 2, 3, 4, 5, 5, 4 };
        //When
        int result = MaxDiff.maxDiff(array);
        //Then
        assertEquals("Only positive numbers" ,4,result);
    }
    @Test
    public void onlyNegativeTest(){
        //Given
        int[] array = new int[]{ -1, -2, -3, -4, -5, -5, -4 };
        //When
        int result = MaxDiff.maxDiff(array);
        //Then
        assertEquals("Only negative numbers" ,4,result);
    }
    @Test
    public void PositiveNegativeTest(){
        //Given
        int[] array = new int[]{ 1, 2, 3, 4, -5, 5, 4 };
        //When
        int result = MaxDiff.maxDiff(array);
        //Then
        assertEquals("Random numbers" ,10,result);
    }
    @Test
    public void SingleNumberTest(){
        //Given
        int[] array = new int[]{ 1 };
        //When
        int result = MaxDiff.maxDiff(array);
        //Then
        assertEquals("Single number" ,0,result);
    }
    @Test
    public void EmptyTest(){
        //Given
        int[] array = new int[]{};
        //When
        int result = MaxDiff.maxDiff(array);
        //Then
        assertEquals("Empty" ,0,result);
    }
}