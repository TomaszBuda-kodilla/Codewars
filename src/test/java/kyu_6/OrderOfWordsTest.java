package kyu_6;

import kyu_6.OrderOfWords;
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
    @Test
    public void test2() {
        assertThat(OrderOfWords.order("4of Fo1r pe6ople g3ood th5e the2"), equalTo("Fo1r the2 g3ood 4of th5e pe6ople"));
    }
}