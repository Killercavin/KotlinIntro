package io.github.devcavin.threads;

public class VirtualThreadDemo {
    public static void main(String[] args) {
        Thread vThread = Thread.ofVirtual()
                .name("VirtualThreadDemo")
                .unstarted(
                () -> System.out.println(Thread.currentThread().getPriority())
        );

        Thread t1 = new Thread(() -> System.out.println(Thread.currentThread().getPriority()));

        t1.start();
        vThread.start();

        try {
            vThread.join();
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
