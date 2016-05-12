package practicum2.task2;

public class PositiveAverageNumber {
    public int average(int a, int b) {
        int mod = a % 2 + b % 2;
        int result = a / 2 + b / 2;
        return result + mod / 2;
    }
}
