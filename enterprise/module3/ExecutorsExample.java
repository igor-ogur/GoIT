package enterprise.module3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class ExecutorsExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        new ExecutorsExample().testException();
    }


    public void testExecute() {
        Executor executor = Executors.newSingleThreadExecutor();
        System.out.println(Thread.currentThread().getName() + " submits task");
        executor.execute(() -> System.out.println(Thread.currentThread().getName() + " async task started"));
        /*executor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " async task started");
            }
        });*/
    }

    public void testSubmit() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(() -> {
            Thread.sleep(1000);
            return "Task executed";
        });
        /*Future<String> future = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(1000);
                return "Task executed";
            }
        });*/
        System.out.println("Waiting for result");
        System.out.println("result: " + future.get());
        executorService.shutdown();
    }

    public void testException() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(() -> {
            throw new RuntimeException("Exception happened");
        });
        /*Future<String> future = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(1000);
                return "Task executed";
            }
        });*/
        System.out.println("Waiting for result");
        Thread.sleep(1000);
        try {
            System.out.println("result: " + future.get());
        } catch (Exception e) {
            System.out.println("Exception occurred");
        }
            executorService.shutdown();
    }

    public void testInvokeAny() throws ExecutionException, InterruptedException {
        List<Callable<String>> callables = new ArrayList<>();
        Random random = new Random();
        IntStream.range(0, 3).forEach(i -> callables.add(() -> {
            Thread.sleep(random.nextInt(1000));
            return String.valueOf(i);
        }));
        ExecutorService executorService = Executors.newCachedThreadPool();
        String result = executorService.invokeAny(callables);

        System.out.println(result);

        executorService.shutdown();
    }

    public void testInvokeAll() throws ExecutionException, InterruptedException {
        List<Callable<String>> callables = new ArrayList<>();
        Random random = new Random();
        IntStream.range(0, 3).forEach(i -> callables.add(() -> {
            Thread.sleep(random.nextInt(1000));
            return String.valueOf(i);
        }));
        ExecutorService executorService = Executors.newCachedThreadPool();
        List<Future<String>> result = executorService.invokeAll(callables);

        for (Future x : result) {
            System.out.println(x.get());
        }

        executorService.shutdown();
    }

    public void testSchedule() {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        System.out.println("Task scheduled " + new Date());
        scheduledExecutorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("Task executed " + new Date());
            }
        }, 1, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();
    }

    public void testScheduleAtFixedRate() throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        System.out.println("Task scheduled " + new Date());
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("Task executed " + new Date());
            }
        }, 1, 1, TimeUnit.SECONDS);
        Thread.sleep(10000);
        scheduledExecutorService.shutdown();
    }

}