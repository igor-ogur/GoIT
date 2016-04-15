package HomeWork5.Task1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinMaxFounderTest {

    @Test
    public void testGetMinElement() throws Exception {
        int[] array = {-1, 5, 3};
        int expectedMinElement = -1;
        Assert.assertEquals(expectedMinElement, MinMaxFounder.getMinElement(array));
    }

    @Test
    public void testGetMaxElement() throws Exception {
        int[] array = {-1, 5, 3};
        int expectedMaxElement = 5;
        Assert.assertEquals(expectedMaxElement, MinMaxFounder.getMaxElement(array));
    }
}