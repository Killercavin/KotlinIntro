package javalab.multithreading.threads;

public class StaticSynchronizedExchanger {
    private static Object staticObject = null;

    public static  synchronized void setObject(Object o) {
        staticObject = o;
    }

    public static synchronized Object getObject() {
        return staticObject;
    }

    public static void setObj(Object o) {
        synchronized (StaticSynchronizedExchanger.class) {
            staticObject = o;
        }
    }

    public static Object getObj() {
        synchronized (StaticSynchronizedExchanger.class) {
            return staticObject;
        }
    }

    public static void main(String[] args) {
    }
}
