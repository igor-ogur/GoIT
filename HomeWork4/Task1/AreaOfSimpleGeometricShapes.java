package HomeWork4.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class AreaOfSimpleGeometricShapes {

    public static double areaOfCircle(double radius){
        return Math.PI*radius*radius;
    }

    public static double areaOfRectangle(double a, double b){
        return a*b;
    }

    public static double areaOfTriangle(double a, double height){
        return a*height/2;
    }

    public static void main(String[] args) {
        double i,j;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите основу треугольника");
            i = Double.parseDouble(reader.readLine());
            if (i <= 0) throw new NumberFormatException();
            System.out.println("Введите высоту треугольника");
            j = Double.parseDouble(reader.readLine());
            if (j <= 0) throw new NumberFormatException();
            System.out.println("Площадь треугольника = " + areaOfTriangle(i, j));
            System.out.println();

            System.out.println("Введите ширину прямоугольника");
            i = Double.parseDouble(reader.readLine());
            if (i <= 0) throw new NumberFormatException();
            System.out.println("Введите высоту прямоугольника");
            j = Double.parseDouble(reader.readLine());
            if (j <= 0) throw new NumberFormatException();
            System.out.println("Площадь прямоугольника = " + areaOfRectangle(i, j));
            System.out.println();

            System.out.println("Введите радиус круга");
            i = Double.parseDouble(reader.readLine());
            if (i <= 0) throw new NumberFormatException();
            System.out.println("Площадь круга = " + areaOfCircle(i));
        }catch (IOException e){
            e.printStackTrace();
        }catch (NumberFormatException e){
            System.out.println("Некорректный ввод данных");
        }
    }
}
