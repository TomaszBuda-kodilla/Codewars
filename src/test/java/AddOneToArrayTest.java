import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddOneToArrayTest {
    @Test
    public void Number(){
        //Given
        int[] array = {1, 2, 3};
        //When
        int[] result = AddOneToArray.increment(array);
        //Then
        Assert.assertArrayEquals(new int[]{1, 2, 4}, result);
    }
    @Test
    public void NumberNine(){
        //Given
        int[] array = {1,2,9};
        //When
        int[] result = AddOneToArray.increment(array);
        //Then
        Assert.assertArrayEquals(new int[]{1, 3, 0}, result);
    }
    @Test
    public void NumberTwoNineNine(){
        //Given
        int[] array = {1,9,9};
        //When
        int[] result = AddOneToArray.increment(array);
        //Then
        Assert.assertArrayEquals(new int[]{2,0,0}, result);
    }
    @Test
    public void NumberBiggerArray(){
        //Given
        int[] array = {9,9,9};
        //When
        int[] result = AddOneToArray.increment(array);
        //Then
        Assert.assertArrayEquals(new int[]{1,0,0,0}, result);
    }
}
