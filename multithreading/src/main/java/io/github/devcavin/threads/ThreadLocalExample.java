package io.github.devcavin.threads;

public class ThreadLocalExample {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();

        Thread t1 = new Thread(() -> {
            threadLocal.set("thread1");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("value of thread 1: " + threadLocal.get());
        });

        Thread t2 = new Thread(() -> {
            threadLocal.set("thread2");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("value of thread 2: " + threadLocal.get());
        });

        t1.start();
        t2.start();
    }
}
