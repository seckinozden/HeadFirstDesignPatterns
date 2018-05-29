package com.ch3.decorator.starbuzz;

public class DarkRoast extends Beverage {

    public DarkRoast(){
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return .99;
    }
}
