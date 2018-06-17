package com.ch12.compoundpatterns;

public class DuckSimulator {

    public static void main(String[] args) {
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulate(duckFactory);
    }

    static void simulate(AbstractDuckFactory factory){
        Quackable mallardDuck = factory.createMallardDuck();
        Quackable redheadDuck = factory.createRedheadDuck();
        Quackable duckCall = factory.createDuckCall();
        Quackable rubberDuck = factory.createRubberDuck();
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
