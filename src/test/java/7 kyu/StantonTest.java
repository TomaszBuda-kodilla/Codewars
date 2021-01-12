import org.junit.*;

import static org.junit.Assert.assertEquals;

public class StantonTest {
    @Test
    public void sampleTests() {
        assertEquals(3, Stanton.stantonMeasure(new int[] {5, 1, 4, 3, 2, 1, 2, 3, 2}));
    }
}