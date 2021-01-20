import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class OrderOfWordsTest {
    @Test
    public void test1(){
        //Given
        String words = "is2 wha1t this3";
        //When
        String result = OrderOfWords.order(words);
        //Then
        assertEquals("wha1t is2 this3",result);
    }
}