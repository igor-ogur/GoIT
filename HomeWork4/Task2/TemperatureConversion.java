package HomeWork4.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TemperatureConversion {

    public static double fromCelsiusToFahrenheit (double celsiusTemperature){
        return 1.8 * celsiusTemperature + 32.0;
    }

    public static double fromFahrenheitToCelsius (double fahrenheitTemperature){
        return (fahrenheitTemperature - 32.0) / 1.8;
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
