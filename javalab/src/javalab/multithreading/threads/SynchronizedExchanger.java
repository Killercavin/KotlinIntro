package javalab.multithreading.threads;

public class SynchronizedExchanger {
    protected Object object = null;

    public synchronized void setObject(Object o) {
        this.object = o;
    }

    public void setObj(Object o) {
        synchronized (this) {
            this.object = o;
        }
    }

    public synchronized Object getObject() {
        return this.object;
    }

    public Object getObj() {
        synchronized (this) {
            return this.object;
        }
    }

    public static void main(String[] args) {
        SynchronizedExchanger exchanger = new SynchronizedExchanger();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                exchanger.setObject("" + i);
            }
    });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println(exchanger.getObject());
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
    }
}
