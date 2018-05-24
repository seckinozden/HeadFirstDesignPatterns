package com.ch1.strategy;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I am quacking.");
    }
}
