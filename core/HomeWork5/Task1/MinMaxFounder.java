package core.HomeWork5.Task1;

public class MinMaxFounder {

    public static int getMinElement(int[] array) throws Exception{
        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < result) {
                result = array[i];
            }
        }
        return result;
    }

    public static int getMaxElement(int[] array) throws Exception{
        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > result) {
                result = array[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random()*100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        try {
            System.out.println("Minimal element of array is " + getMinElement(array));
            System.out.println("Maximal element of array is " + getMaxElement(array));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
