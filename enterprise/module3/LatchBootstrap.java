package enterprise.module3;

import java.util.stream.IntStream;

public class LatchBootstrap {

    public static void main(String[] args) {
        new LatchBootstrap().test();
    }

    private CountDownLatch countDownLatch;
    public void test(){
        countDownLatch = new CountDownLatch(10);
        IntStream.range(0, 10).forEach(i -> new Thread(new Worker()).start());
        new Thread(() -> {
            while (countDownLatch.getCounter() > 0){
                countDownLatch.countDown();
            }
        }).start();
    }

    public class Worker implements Runnable{

        @Override
        public void run() {
            try {
                System.out.println("Thread " + Thread.currentThread().getName() + " start waiting");
                countDownLatch.await();
                System.out.println("Thread " + Thread.currentThread().getName() + " stop waiting");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
