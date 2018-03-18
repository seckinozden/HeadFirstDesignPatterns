package com.ch5.singleton;

/**
 * Synchronized block activated only when instance is not initialized. This way has better performance than synchronizing whole getInstance method.
 */
public class Singleton_DoubleChecked {

    private volatile static Singleton_DoubleChecked instance;

    private Singleton_DoubleChecked() {
    }

    public static Singleton_DoubleChecked getInstance() {
        if (instance == null)
            synchronized (Singleton_DoubleChecked.class) {
                if (instance == null) {
                    instance = new Singleton_DoubleChecked();
                }
            }
        return instance;
    }
}
