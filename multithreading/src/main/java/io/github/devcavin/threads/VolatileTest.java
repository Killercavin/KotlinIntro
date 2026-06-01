package io.github.devcavin.threads;

public class VolatileTest {
    static volatile int value = 0;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            value ++;
            System.out.println("Value from thread 1: " + value);
        });

        Thread t2 = new Thread(() -> {
            value ++;
            System.out.println("Value from thread 2: " + value);
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
