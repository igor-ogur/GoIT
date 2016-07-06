package enterprise.homework3_2;

import org.junit.Assert;
import org.junit.Test;

public class SquareSumSolutionTest {

    @Test
    public void testGetSquareSum() throws Exception {
        int[] array = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        long actualResult = new SquareSumSolution().getSquareSum(array, 4);
        Assert.assertEquals(85, actualResult);
    }

    @Test
    public void testGetSquareSumSecond() throws Exception {
        int[] array = {5};
        long actualResult = new SquareSumSolution().getSquareSum(array, 4);
        Assert.assertEquals(25, actualResult);
    }
}