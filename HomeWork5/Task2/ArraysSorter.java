package HomeWork5.Task2;


public class ArraysSorter {

    public static double[] sortArrayFromMinToMax (double[] array) throws Exception{
        boolean check = true;
        while (check) {
            check = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    double temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    check = true;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        double[] array = new double[10];
        for (int i = 0; i < 10; i++) {
            array[i] = Math.floor(Math.random()*10000)/100;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        try {
            array = sortArrayFromMinToMax(array);
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
