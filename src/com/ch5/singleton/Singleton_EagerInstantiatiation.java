package com.ch5.singleton;

/**
 * This way multithreading is not problem
 * If initialization takes too long, it might be problem for program startup.
 */
public class Singleton_EagerInstantiatiation {

    private static Singleton_EagerInstantiatiation instance = new Singleton_EagerInstantiatiation();

    private Singleton_EagerInstantiatiation() {
    }

    public static Singleton_EagerInstantiatiation getInstance() {
        return instance;
    }
}
