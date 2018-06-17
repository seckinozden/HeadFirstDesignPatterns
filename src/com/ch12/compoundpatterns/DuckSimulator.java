package com.ch12.compoundpatterns;

public class DuckSimulator {

    public static void main(String[] args) {
        simulate();
    }

    static void simulate(){
        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedHeadDuck();
        DuckCall duckCall = new DuckCall();
        RubberDuck rubberDuck = new RubberDuck();

        System.out.println("Duck Simulator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
    }

    static void simulate(Quackable quackable){
        quackable.quack();
    }
}
