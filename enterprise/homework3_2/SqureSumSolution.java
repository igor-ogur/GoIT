package enterprise.homework3_2;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SqureSumSolution implements SquareSum{
    @Override
    public long getSquareSum(int[] values, int numberOfThreads) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        Future<Integer> future = executorService.submit(() -> {
            return 0;
        });
        return 0;
    }
}
