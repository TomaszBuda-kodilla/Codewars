package kyu_8.stream;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GrowTest{
    @Test
    public void testSomething() {
        assertEquals(6, Grow.grow(new int[]{1,2,3}));
        assertEquals(16, Grow.grow(new int[]{4,1,1,1,4}));
        assertEquals(64, Grow.grow(new int[]{2,2,2,2,2,2}));
    }
}