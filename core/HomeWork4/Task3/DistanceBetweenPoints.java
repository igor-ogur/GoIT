package core.HomeWork4.Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DistanceBetweenPoints {

    public static double distanceCalculating (double x1, double y1, double x2, double y2){
        return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    }

    public static void main(String[] args) {
        double x1, x2, y1, y2;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите х1");
            x1 = Double.parseDouble(reader.readLine());

            System.out.println("Введите y1");
            y1 = Double.parseDouble(reader.readLine());

            System.out.println("Введите х2");
            x2 = Double.parseDouble(reader.readLine());

            System.out.println("Введите y2");
            y2 = Double.parseDouble(reader.readLine());

            System.out.println("Расстояние между точками = " + distanceCalculating(x1, y1, x2, y2));
        }catch (IOException e){
            e.printStackTrace();
        }catch (NumberFormatException e){
            System.out.println("Некорректный ввод данных");
        }
    }
}
