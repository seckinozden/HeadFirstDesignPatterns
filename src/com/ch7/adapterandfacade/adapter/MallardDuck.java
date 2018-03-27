package com.ch7.adapterandfacade.adapter;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Mallard Duck quacking");
    }

    @Override
    public void fly() {
        System.out.println("Mallard Duck flying.");
    }
}
