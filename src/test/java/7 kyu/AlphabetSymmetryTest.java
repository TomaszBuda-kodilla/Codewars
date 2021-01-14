import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class AlphabetSymmetryTest {
    @Test
    public void test1(){
        //Given
        String[] words = new String[]{"abode","ABc","xyzD"};
        //When
        int[] result = AlphabetSymmetry.solve(words);
        //Then
        assertArrayEquals(new int[]{4,3,1},result);
    }
    @Test
    public void test2(){
        //Given
        String[] words = new String[]{"abide","ABc","xyz"};
        //When
        int[] result = AlphabetSymmetry.solve(words);
        //Then
        assertArrayEquals(new int[]{4,3,0},result);
    }
    @Test
    public void test3(){
        //Given
        String[] words = new String[]{"IAMDEFANDJKL","thedefgh","xyzDEFghijabc"};
        //When
        int[] result = AlphabetSymmetry.solve(words);
        //Then
        assertArrayEquals(new int[]{6,5,7},result);
    }
    @Test
    public void test4(){
        //Given
        String[] words = new String[]{"encode","abc","xyzD","ABmD"};
        //When
        int[] result = AlphabetSymmetry.solve(words);
        //Then
        assertArrayEquals(new int[]{1,3,1,3},result);
    }
}