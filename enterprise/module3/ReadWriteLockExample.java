package enterprise.module3;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReadWriteLockExample {
    public static final int ARRAY_LENGTH = 10;

    public static void main(String[] args) {
        ConcurrentArray<Integer> concurrentArray = new ConcurrentArray<>(ARRAY_LENGTH);
        IntStream.range(0, 3).forEach(i -> new Thread(() -> {
            while (true){
                System.out.println("Reading: " + Arrays.toString(concurrentArray.read()));
            }
        }).start());
        new Thread(() -> {
            Random random = new Random();
            while (true) {
                Integer[] ints = Stream.generate(random::nextInt).limit(random.nextInt(ARRAY_LENGTH+1)).toArray(Integer[]::new);
                /*int size = random.nextInt(ARRAY_LENGTH+1);
                ints = new Integer[size];
                for (int i = 0; i < size; i++) {
                    ints[i] = random.nextInt();
                }*/
                concurrentArray.write(ints, 0);
            }
        }).start();
    }
    public static class ConcurrentArray<T> {
        private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        private Object[] items;
        private Random random = new Random();

        public ConcurrentArray(int capacity) {
            items = new Object[capacity];
        }

        public void write(T[] values, int index) {
            readWriteLock.writeLock().lock();
            try {
                if (values.length + index > items.length) {
                    throw new RuntimeException("Not enough space");
                }
                System.arraycopy(values, 0, items, index, values.length);
                System.out.println("Array update: " + Arrays.toString(items));
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                throw new RuntimeException();
            } finally {
                readWriteLock.writeLock().unlock();
            }

        }

        public T[] read() {
            readWriteLock.readLock().lock();
            try{
                Object[] result = Arrays.copyOf(items, items.length);
                Thread.sleep(random.nextInt(1000));
                return (T[]) result;
            } catch (InterruptedException e) {
                throw new RuntimeException();
            } finally {
                readWriteLock.readLock().unlock();
            }
        }
    }
}
