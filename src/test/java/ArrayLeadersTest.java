import org.junit.Assert;
import org.junit.Test;

public class ArrayLeadersTest {
    @Test
    public void ArrayLeaderOnlyOne() {
        //Given
        int[] array = {1,2,3};
        //When
        int[] result = ArrayLeaders.findLeader(array);
        //Then
        Assert.assertArrayEquals(new int[]{3},result);
    }
}
