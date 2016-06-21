package enterprise.module3;

public class CountDownLatch {
    private int counter = 0;
    private final Object lock = new Object();

    public CountDownLatch(int counter) {
        this.counter = counter;
    }

    public void await() throws InterruptedException {
        synchronized (lock) {
            if (counter > 0) {
                lock.wait();
            }
        }
    }

    public void countDown() {
        synchronized (lock) {
            if (counter > 0) {
                counter--;
                System.out.println("counter = " + counter);
            }
            if (counter == 0) {
                lock.notifyAll();
            }
        }
    }

    public int getCounter() {
        return counter;
    }
}
