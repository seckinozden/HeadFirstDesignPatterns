package com.ch10.state;

public class WinnerState implements State {
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can not insert coint, you are about to get two gumballs.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can not eject quarter since you are about the get two gumballs.");
    }

    @Override
    public void turnCrank() {
        System.out.println("You can not turn crank since you are about the get two gumballs.");
    }

    @Override
    public void dispense() {
        System.out.println("YOU’RE A WINNER! You get two gumballs for your quarter");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            System.out.println("Oops, out of gumballs! We can not give you the second gumball :(");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Oops, out of gumballs! You got the latest two gumballs");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }

    @Override
    public void refill(int numberOfGumballs) {
        System.out.println("You can not refill the gumball machine since there are gumballs in the machine.");
    }
}
