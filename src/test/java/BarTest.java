import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarTest{
    @Test
    public void OneDrinkTest() {
        //Given
        String drinks = "1 beer", answer = "1 glass of water";
        //When
        String result = Bar.hydrate(drinks);
        //Then
        assertEquals(answer,result);
    }
    @Test
    public void TenDrinksTest() {
        //Given
        String drinks = "1 shot, 5 beers, 2 shots, 1 glass of wine, 1 beer", answer = "10 glasses of water";
        //When
        String result = Bar.hydrate(drinks);
        //Then
        assertEquals(answer,result);
    }
}