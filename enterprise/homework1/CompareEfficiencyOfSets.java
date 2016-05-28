package enterprise.homework1;

import java.util.Arrays;
import java.util.Set;

public class CompareEfficiencyOfSets {

    public static long countTimeToPopulateSet (Set set, int numberOfElements){
        long start = System.nanoTime();
        for (int i = 0; i < numberOfElements; i++) {
            set.add(i);
        }
        return System.nanoTime() - start;
    }

    public static long countTimeToContainsInSet (Set set, int numberOfElements){
        int i = (int) (Math.random() * (numberOfElements-1));
        long start = System.nanoTime();
        set.contains(i);
        return System.nanoTime() - start;
    }

    public static long countTimeToAddToSet (Set set, int numberOfElements){
        int i = (int) (Math.random() * (numberOfElements-1));
        long start = System.nanoTime();
        set.add(i);
        return System.nanoTime() - start;
    }

    public static long countTimeToRemoveFromSet (Set set, int numberOfElements){
        int i = (int) (Math.random() * (numberOfElements-1));
        long start = System.nanoTime();
        set.remove(i);
        return System.nanoTime() - start;
    }

    public static double[] getAverageTimeForEachOperations (Set set, int numberOfElements) {
        double[] averages = new double[4];
        long[] times = new long[100];
        for (int i = 0; i < 100; i++) {
            set.clear();
            times[i] = countTimeToPopulateSet(set, numberOfElements);
        }
        averages[0] = Arrays.stream(times).average().getAsDouble();

        for (int i = 0; i < 100; i++) {
            times[i] = countTimeToContainsInSet(set, numberOfElements);
        }
        averages[1] = Arrays.stream(times).average().getAsDouble();

        for (int i = 0; i < 100; i++) {
            times[i] = countTimeToAddToSet(set, numberOfElements);
        }
        averages[2] = Arrays.stream(times).average().getAsDouble();

        for (int i = 0; i < 100; i++) {
            times[i] = countTimeToRemoveFromSet(set, numberOfElements);
        }
        averages[3] = Arrays.stream(times).average().getAsDouble();

        return averages;
    }
}
