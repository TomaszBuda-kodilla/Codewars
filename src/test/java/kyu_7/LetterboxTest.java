package kyu_7;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class LetterboxTest {
    @Test
    public void simpleTest() {
        assertArrayEquals(new int[]{1,9,6,3,0,1,1,1,1,1}, Letterbox.paintLetterboxes(125,132));
    }
}