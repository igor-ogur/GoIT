package practicum1.task4;

public class FindMaxNumber {
    public int max(int[] input) {
        int result = input[0];
        for (int x : input){
            if (x > result) {
                result = x;
            }
        }
        return result;
    }
}
