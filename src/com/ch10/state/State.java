package com.ch10.state;

public interface State {

    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
    void refill(int numberOfGumballs);
}
