package com.ch10.state;

public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("There is no gumball to ball. We can't let you insert quarter.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You have not inserted any quarter.");
    }

    @Override
    public void turnCrank() {
        System.out.println("You are not allowed to turn crank since you have not inserted any quarter.");
    }

    @Override
    public void dispense() {
        System.out.println("All gumballs soldout. Can not dispense!");
    }
}
