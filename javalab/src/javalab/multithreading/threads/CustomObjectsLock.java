package javalab.multithreading.threads;

public class CustomObjectsLock {
    private static int counter1 = 0;
    private static int counter2 = 0;
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                incrementOne();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                incrementTwo();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Counter 1: " + counter1);
        System.out.println("Counter 2: " + counter2);
    }

    private static void incrementOne() {
        synchronized (lock1) {
            counter1++;
        }
    }

    private static void incrementTwo() {
        synchronized (lock2) {
            counter2++;
        }
    }
}
