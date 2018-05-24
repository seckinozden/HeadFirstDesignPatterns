package com.ch1.strategy;

public class Squack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Squack Squack!!");
    }
}
