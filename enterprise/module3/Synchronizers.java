package enterprise.module3;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Exchanger;
import java.util.stream.IntStream;

public class Synchronizers {

    public static void main(String[] args) throws InterruptedException {
        Synchronizers synchronizers = new Synchronizers();
        synchronizers.testCyclicBarrier();
    }

    public void testCyclicBarrier() throws InterruptedException {
        CyclicBarrier barrier = new CyclicBarrier(5, () -> System.out.println("Barrier exceed"));
        while (true) {
            new Thread(() -> {
                try {
                    String threadName = Thread.currentThread().getName();
                    System.out.println(threadName + " starts waiting on barrier.");
                    barrier.await();
                    System.out.println(threadName + " finish waiting");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();
            Thread.sleep(1000);
        }
    }

    public void testExchanger(){
        Exchanger<String> exchanger = new Exchanger<>();
        IntStream.range(0, 2).forEach(i -> new Thread(() -> {
            try {
                String threadName = Thread.currentThread().getName();
                Random random = new Random();
                Thread.sleep(random.nextInt(1000));
                System.out.println(threadName + " ready to exchange");
                System.out.println(threadName + " <-> " + exchanger.exchange(threadName));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start());
    }
}
