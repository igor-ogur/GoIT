package enterprise.homework1;

import java.util.*;

public class CompareEfficiencyOfLists {

    public static long countTimeToPopulateList (List list, int numberOfElements){
        long start = System.nanoTime();
        for (int i = 0; i < numberOfElements; i++) {
            list.add(i);
        }
        return System.nanoTime() - start;
    }

    public static long countTimeToAddToList (List list, int numberOfElements){
        int i = (int) (Math.random() * (numberOfElements-1));
        long start = System.nanoTime();
        list.add(i, i);
        return System.nanoTime() - start;
    }

    public static long countTimeToGetFromList (List list, int numberOfElements){
        int i = (int) (Math.random() * (numberOfElements-1));
        long start = System.nanoTime();
        list.get(i);
        return System.nanoTime() - start;
    }

    public static long countTimeToContainsInList (List list, int numberOfElements){
        int i = (int) (Math.random() * (numberOfElements-1));
        long start = System.nanoTime();
        list.contains(i);
        return System.nanoTime() - start;
    }

    public static long countTimeToRemoveFromList (List list, int numberOfElements){
        int i = (int) (Math.random() * (numberOfElements-1));
        long start = System.nanoTime();
        list.remove(i);
        return System.nanoTime() - start;
    }

    public static long countTimeToListIteratorAdd (List list, int numberOfElements){
        int i = (int) (Math.random() * (numberOfElements-1));
        ListIterator iterator = list.listIterator();
        long start = System.nanoTime();
        iterator.add(i);
        return System.nanoTime() - start;
    }

    public static long countTimeToListIteratorRemove (List list, int numberOfElements){
        ListIterator iterator = list.listIterator();
        long start = System.nanoTime();
        iterator.next();
        iterator.remove();
        return System.nanoTime() - start;
    }

    public static double[] getAverageTimeForEachOperations (List list, int numberOfElements){
        double[] averages = new double[7];
        long[] times = new long[100];
        for (int i = 0; i < 100; i++) {
            list.clear();
            times[i] = countTimeToPopulateList(list, numberOfElements);
        }
        averages[0] = Arrays.stream(times).average().getAsDouble();

        for (int i = 0; i < 100; i++) {
            times[i] = countTimeToGetFromList(list, numberOfElements);
        }
        averages[1] = Arrays.stream(times).average().getAsDouble();

        for (int i = 0; i < 100; i++) {
            times[i] = countTimeToContainsInList(list, numberOfElements);
        }
        averages[2] = Arrays.stream(times).average().getAsDouble();

        for (int i = 0; i < 100; i++) {
            times[i] = countTimeToAddToList(list, numberOfElements);
        }
        averages[3] = Arrays.stream(times).average().getAsDouble();

        for (int i = 0; i < 100; i++) {
            times[i] = countTimeToRemoveFromList(list, numberOfElements);
        }
        averages[4] = Arrays.stream(times).average().getAsDouble();

        for (int i = 0; i < 100; i++) {
            times[i] = countTimeToListIteratorAdd(list, numberOfElements);
        }
        averages[5] = Arrays.stream(times).average().getAsDouble();

        for (int i = 0; i < 100; i++) {
            times[i] = countTimeToListIteratorRemove(list, numberOfElements);
        }
        averages[6] = Arrays.stream(times).average().getAsDouble();
        return averages;
    }
}
