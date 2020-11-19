import org.junit.Assert;
import org.junit.Test;

public class RowWeightsTest {
    @Test
    public void SimpleArrayTest()
    {
        //Given
        int array[] = new int[]{80,0};
        //When
        int[] result = RowWeights.counter(array);
        //Then
        Assert.assertArrayEquals(new int[]{80,0},result);
    }
    @Test
    public void BiggerArrayTest()
    {
        //Given
        int array[] = new int[]{80,0,25,100};
        //When
        int[] result = RowWeights.counter(array);
        //Then
        Assert.assertArrayEquals(new int[]{105,100},result);
    }
}
