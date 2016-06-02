package core.HomeWork4.Task3;

import org.junit.Assert;
import org.junit.Test;


public class DistanceBetweenPointsTest {

    @Test
    public void testDistanceCalculating() throws Exception {
        double x1 = -1.5;
        double y1 = -5.7;
        double x2 = 3.0;
        double y2 = 7.8;
        double expectedResult = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
        Assert.assertEquals(expectedResult, DistanceBetweenPoints.distanceCalculating(x1,y1,x2,y2), 0.000001);
    }
}