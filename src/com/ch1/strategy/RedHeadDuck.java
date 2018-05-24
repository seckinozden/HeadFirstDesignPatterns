package com.ch1.strategy;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Squack();
    }

    @Override
    void display() {
        System.out.println("I look like Redhead duck.");
    }
}
