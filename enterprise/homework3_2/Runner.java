package enterprise.homework3_2;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.stream.IntStream;

public class Runner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Random random = new Random();
        int[] values = new int[10];
        IntStream.range(0, 10).forEach(i -> values[i] = random.nextInt(20));
        IntStream.range(0, 10).forEach(i -> System.out.print(values[i]+" "));
        System.out.println();
        System.out.println(new SquareSumSolution().getSquareSum(values, 3));
    }
}
