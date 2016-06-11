package enterprise.homework3;

public class SemaphoreExample implements Semaphore {

    int permits;
    int maxPermits;

    public SemaphoreExample(int permits, int maxPermits) {
        this.permits = permits;
        this.maxPermits = maxPermits;
    }

    @Override
    public synchronized void acquire() throws InterruptedException {
        if (this.permits > 0) {
            this.permits--;
        } else {
            this.wait();
        }
    }

    @Override
    public synchronized void acquire(int permits) throws InterruptedException {
        if (permits < 0) {
            System.out.println("Permits number must be > 0");
            return;
        }
        if (this.permits >= permits) {
            this.permits -= permits;
        } else if (this.permits > 0) {
            this.notify();
        } else {
            this.wait();
        }
    }

    @Override
    public synchronized void release() {
        if (this.permits < maxPermits) {
            this.permits++;
        } else {
            System.out.println("Cannot add permits. Max number of permits has been reached already.");
        }
        this.notify();

    }

    @Override
    public synchronized void release(int permits) {
        if (permits < 0) {
            System.out.println("Permits number must be > 0");
            return;
        }
        if (this.permits + permits <= maxPermits) {
            this.permits += permits;
        } else if (this.permits + permits > maxPermits) {
            this.permits = maxPermits;
        } else {
            System.out.println("Cannot add permits. Max number of permits has been reached already.");
        }
        this.notify();
    }

    @Override
    public synchronized int getAvailablePermits() {
        return this.permits;
    }
}
