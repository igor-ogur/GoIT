package core.HomeWork4.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TemperatureConversion {

    final static double CONSTANT_1 = 1.8;
    final static double CONSTANT_2 = 32.0;

    public static double fromCelsiusToFahrenheit (double celsiusTemperature){
        return  CONSTANT_1 * celsiusTemperature + CONSTANT_2;
    }

    public static double fromFahrenheitToCelsius (double fahrenheitTemperature){
        return (fahrenheitTemperature - CONSTANT_2) / CONSTANT_1;
    }

    public static void main(String[] args) {
        double i;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите температуру в C");
            i = Double.parseDouble(reader.readLine());
            System.out.println("Температура в F = " + fromCelsiusToFahrenheit(i));
            System.out.println();

            System.out.println("Введите температуру в F");
            i = Double.parseDouble(reader.readLine());
            System.out.println("Температура в C = " + fromFahrenheitToCelsius(i));

        }catch (IOException e){
            e.printStackTrace();
        }catch (NumberFormatException e){
            System.out.println("Некорректный ввод данных");
        }
    }
}
