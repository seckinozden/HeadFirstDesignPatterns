package com.ch12.compoundpatterns;

public class Quackologist implements Observer {
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + "just quacked.");
    }
}
