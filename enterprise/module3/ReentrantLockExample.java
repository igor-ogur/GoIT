package enterprise.module3;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

public class ReentrantLockExample {

    private final Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        ReentrantLockExample reentrantLock = new ReentrantLockExample();
        IntStream.range(0, 10).forEach(i -> new Thread(reentrantLock::test).start());
        /*for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    locks.test();
                }
            }).start();
        }*/
    }

    public void test() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " tries lock");
        try {
            if (lock.tryLock(100, TimeUnit.MILLISECONDS)) {
                //lock.lockInterruptibly();
                Thread.sleep(20);
                try {
                    System.out.println(threadName + " executing critical section");
                } finally {
                    System.out.println(threadName + " realising lock");
                    lock.unlock();
                }
            }else{
                System.out.println(threadName + " unable acquire lock");
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
