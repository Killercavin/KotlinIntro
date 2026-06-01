package io.github.devcavin.threads;

public class VolatileDemo {

    static volatile boolean running = true;

    public static void main(String[] args) throws Exception {

        Thread worker = new Thread(() -> {

            System.out.println("Worker started");

            long counter = 0;

            while (running) {
                counter++;
            }

            System.out.println("Counter = " + counter);
        });

        worker.start();

        Thread.sleep(2000);

        System.out.println("Setting running=false");

        running = false;

        worker.join();

        System.out.println("Done");
    }
}