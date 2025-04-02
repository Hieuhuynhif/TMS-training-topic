package org.example.javacore;

class Counter {
    private int count = 0;
//    private final Lock lock = new ReentrantLock();
//    Optional use lock to manually config race condition
    // Synchronized method to ensure thread-safety
    public synchronized void increment() {
//        lock.lock();
        count++;
        System.out.println(Thread.currentThread().getName() + " - Count: " + count);
//        lock.unlock();
    }

    public int getCount() {
        return count;
    }
}

public class ConcurrencyThreadSafe {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();
        // Task to increment counter
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                counter.increment();
                try {
                    Thread.sleep(100); // Simulate work
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        };

        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Done: couter " + counter.getCount());

    }
}
