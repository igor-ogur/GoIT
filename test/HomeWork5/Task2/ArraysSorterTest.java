package HomeWork5.Task2;

import org.junit.Assert;
import org.junit.Test;


public class ArraysSorterTest {

    @Test
    public void testSortArrayFromMinToMax() throws Exception {
        double[] array = {1.1, -5.8, 3.4};
        double[] expectedResult = {-5.8, 1.1 ,3.4};
        Assert.assertArrayEquals(expectedResult, ArraysSorter.sortArrayFromMinToMax(array), 0.000001);
    }
}