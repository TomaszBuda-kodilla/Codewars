import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindScreenSizeTest {
    @Test
    public void resolution4x3() {
        //Given
        int resolution = 1024;
        String ratio = "4:3";
        //When
        String result = FindScreenSize.find(resolution, ratio);
        //Then
        assertEquals("1024x768", result);
    }

    @Test
    public void resolution16x9() {
        //Given
        int resolution = 1280;
        String ratio = "16:9";
        //When
        String result = FindScreenSize.find(resolution, ratio);
        //Then
        assertEquals("1280x720", result);
    }

    @Test
    public void resolution32x9() {
        //Given
        int resolution = 3840;
        String ratio = "32:9";
        //When
        String result = FindScreenSize.find(resolution, ratio);
        //Then
        assertEquals("3840x1080", result);
    }
}
