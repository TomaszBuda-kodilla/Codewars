import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SumArraysTest{
    @Test
    public void onlyPositiveTest(){
        //Given
        double[] numbers = new double[]{2,2.6,6,8,0.4};
        //When
        double result = SumArrays.sum(numbers);
        //Then
        assertEquals(19.0,result,0.1);
    }
    @Test
    public void onlyNegativeTest(){
        //Given
        double[] numbers = new double[]{-2,-2.6,-6,-8,-0.4};
        //When
        double result = SumArrays.sum(numbers);
        //Then
        assertEquals(-19.0,result,0.1);
    }
    @Test
    public void EmptyTest(){
        //Given
        double[] numbers = new double[]{};
        //When
        double result = SumArrays.sum(numbers);
        //Then
        assertEquals(0,result,0.1);
    }
}