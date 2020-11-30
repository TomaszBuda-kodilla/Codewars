import org.junit.Assert;
import org.junit.Test;

public class PoetTest {
    @Test
    public void CheckShortLengthPositives() {
        //Given
        int[] myNumber = new int[] {10,4,9,7,5};
        //When
        int[] result = Poet.pandulum(myNumber);
        //Then
        Assert.assertArrayEquals(new int[]{10,7,4,5,9}, result);
    }
    @Test
    public void CheckShortLengthNegatives() {
        //Given
        int[] myNumber = new int[] {-10,-9,-7,-5};
        //When
        int[] result = Poet.pandulum(myNumber);
        //Then
        Assert.assertArrayEquals(new int[]{-7,-10,-9,-5}, result);
    }
}
