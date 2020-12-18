import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PascalTriangleTest {
    @Test
    public void testOneLevelTriangle() {
        final long[] terms = {1L};
        assertThat(PascalTriangle.generate(1), is(terms));
    }

    @Test
    public void testTwoLevelsTriangle() {
        final long[] terms = {1L, 1L, 1L};
        assertThat(PascalTriangle.generate(2), is(terms));
    }

    @Test
    public void testFourLevelsTriangle() {
        final long[] terms = {1L, 1L, 1L, 1L, 2L, 1L, 1L, 3L, 3L, 1L};
        assertThat(PascalTriangle.generate(4), is(terms));
    }
}