import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergingTest {
    @Test
    public void noDuplicatesTest(){
        //Given
        int[] arrayOne = new int[] {1,3,5};
        int[] arrayTwo = new int[] {2,4,6};
        //When
        int[] result = Merging.mergeArrays(arrayOne,arrayTwo);
        //Then
        assertArrayEquals(new int[] {1,2,3,4,5,6},result);
    }
    @Test
    public void DuplicatesTest(){
        //Given
        int[] arrayOne = new int[] {2,4,8};
        int[] arrayTwo = new int[] {2,4,6};
        //When
        int[] result = Merging.mergeArrays(arrayOne,arrayTwo);
        //Then
        assertArrayEquals(new int[] {2,4,6,8},result);
    }

}