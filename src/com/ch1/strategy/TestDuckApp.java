package com.ch1.strategy;

public class TestDuckApp {

    public static void main(String[] args) {

        Duck mallardDuck = new MallardDuck();

        mallardDuck.performFly();
        mallardDuck.performQuack();

        Duck decoyDuck = new DecoyDuck();

        decoyDuck.performFly();
        decoyDuck.performQuack();
    }
}
