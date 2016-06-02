package core.HomeWork4.Task2;

import org.junit.Assert;
import org.junit.Test;


public class TemperatureConversionTest {

    final static double CONSTANT_1 = 1.8;
    final static double CONSTANT_2 = 32.0;


    @Test
    public void testFromCelsiusToFahrenheit() throws Exception {
        double celsiusTemperature = 20.0;
        double expectedResult = celsiusTemperature * CONSTANT_1 + CONSTANT_2;
        Assert.assertEquals(expectedResult, TemperatureConversion.fromCelsiusToFahrenheit(celsiusTemperature), 0.0000001);
    }

    @Test
    public void testFromFahrenheitToCelsius() throws Exception {
        double fahrenheitTemperature = 451.0;
        double expectedResult = (fahrenheitTemperature - CONSTANT_2) / CONSTANT_1;
        Assert.assertEquals(expectedResult, TemperatureConversion.fromFahrenheitToCelsius(fahrenheitTemperature), 0.0000001);
    }
}