package HomeWork4.Task1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Admin on 14.04.16.
 */
public class AreaOfSimpleGeometricShapesTest {
    /*@BeforeClass
    public void setUpClass() throws Exception {
        AreaOfSimpleGeometricShapes areaOfSimpleGeometricShapes = new AreaOfSimpleGeometricShapes();
    }*/

    @Test
    public void testAreaOfCircle() throws Exception {
        double radius = 5.5;
        double expectedResult = radius * radius * Math.PI;
        Assert.assertEquals(expectedResult, AreaOfSimpleGeometricShapes.areaOfCircle(radius), 0.00001);
    }

    @Test
    public void testAreaOfRectangle() throws Exception {
        double firstSide = 2.7;
        double secondSide = 4.5;
        double expectedResult = firstSide * secondSide;
        Assert.assertEquals(expectedResult, AreaOfSimpleGeometricShapes.areaOfRectangle(firstSide, secondSide), 0);
    }

    @Test
    public void testAreaOfTriangle() throws Exception {
        double height = 1.8;
        double triangleBase = 5.4;
        double expectedResult = height * triangleBase / 2;
        Assert.assertEquals(expectedResult, AreaOfSimpleGeometricShapes.areaOfTriangle(triangleBase, height), 0);
    }

}