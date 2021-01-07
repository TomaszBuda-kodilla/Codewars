import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindGCFTest {
    @Test
    public void BGreaterThenATest() {
        //Given
        int a = 8, b = 20;
        //When
        int result = FindGCF.findGFC(a, b);
        //Then
        assertEquals(4, result);
    }

    @Test
    public void AGreaterThenBTest() {
        //Given
        int a = 13, b = 5;
        //When
        int result = FindGCF.findGFC(a, b);
        //Then
        assertEquals(1, result);
    }

    @Test
    public void SameNumbersTest() {
        //Given
        int a = 100, b = 100;
        //When
        int result = FindGCF.findGFC(a, b);
        //Then
        assertEquals(100, result);
    }
}