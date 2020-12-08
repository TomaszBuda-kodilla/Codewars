import org.junit.Test;
import static org.junit.Assert.*;

public class SumPartsTest {
    @Test
    public void OneElementTable(){
        //Given
        int[] arr = new int[]{};
        //When
        int[] result = SumParts.sumParts(arr);
        //Then
        assertArrayEquals(new int[]{0},result);
    }
    @Test
    public void FiveElementsTable(){
        //Given
        int[] arr = new int[]{0,1,3,6,10};
        //When
        int[] result = SumParts.sumParts(arr);
        //Then
        assertArrayEquals(new int[]{20,20,19,16,10,0},result);
    }
    @Test
    public void BiggerElementsTable(){
        //Given
        int[] arr = new int[]{744125, 935, 407, 454, 430, 90, 144, 6710213, 889, 810, 2579358};
        //When
        int[] result = SumParts.sumParts(arr);
        //Then
        assertArrayEquals(new int[]{10037855, 9293730, 9292795, 9292388, 9291934, 9291504, 9291414, 9291270, 2581057, 2580168, 2579358, 0},result);
    }
}

/* 150000 and 200000 elements crush */
