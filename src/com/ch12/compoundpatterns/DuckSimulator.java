package com.ch12.compoundpatterns;

public class DuckSimulator {

    public static void main(String[] args) {
        simulate();
    }

    static void simulate(){
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redheadDuck = new QuackCounter(new RedHeadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        GooseAdapter goose = new GooseAdapter(new Goose());

        System.out.println("\n ## Duck Simulator ## \n");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(goose);

        System.out.println("\n -> Total number of quacks: " + QuackCounter.numberOfQuacks);
    }

    static void simulate(Quackable quackable){
        quackable.quack();
    }
}
