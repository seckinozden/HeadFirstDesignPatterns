package com.ch1.strategy;

public class DecoyDuck extends Duck {

    public DecoyDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    void display() {

    }
}
