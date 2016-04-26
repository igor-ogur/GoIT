package practicum1.task2;

public class SumDigits {
    public int sum(int number) {
        long absolute = number;
        absolute = Math.abs(absolute);
        int result = 0;
        while (absolute >= 1){
            long t = absolute % 10;
            result += t;
            absolute /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new SumDigits().sum(-2147483648));
    }
}
