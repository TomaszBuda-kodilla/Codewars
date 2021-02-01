package kyu_7;

import org.junit.Test;

import static org.junit.Assert.*;

public class AveragePlusNextTest {
    @Test
    public void nullArrayTest() {
        //Given
        int[] array = null;
        //When
        double[] result = AveragePlusNext.averages(array);
        //Then
        assertArrayEquals(new double[]{},result,0.1);
    }
    @Test
    public void emptyArrayTest() {
        //Given
        int[] array = new int[]{};
        //When
        double[] result = AveragePlusNext.averages(array);
        //Then
        assertArrayEquals(new double[]{},result,0.1);
    }
    @Test
    public void oneElementArrayTest() {
        //Given
        int[] array = new int[]{1};
        //When
        double[] result = AveragePlusNext.averages(array);
        //Then
        assertArrayEquals(new double[]{},result,0.1);
    }
    @Test
    public void twoElementsArrayTest() {
        //Given
        int[] array = new int[]{1,2};
        //When
        double[] result = AveragePlusNext.averages(array);
        //Then
        assertArrayEquals(new double[]{1.5},result,0.1);
    }
}