package kyu_6;

import kyu_6.SplitStrings;
import org.junit.*;

public class SplitStringsTest {
    @Test
    public void evenStringTest(){
        //Given
        String myWord = "abcd";
        //When
        String[] result = SplitStrings.split(myWord);
        //Then
        Assert.assertArrayEquals(new String[]{"ab", "cd"},result);
    }
    @Test
    public void oddStringTest(){
        //Given
        String myWord = "abcde";
        //When
        String[] result = SplitStrings.split(myWord);
        //Then
        Assert.assertArrayEquals(new String[]{"ab", "cd", "e_"},result);
    }

}