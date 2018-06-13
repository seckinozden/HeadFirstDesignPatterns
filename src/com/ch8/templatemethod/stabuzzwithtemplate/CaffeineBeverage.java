package com.ch8.templatemethod.stabuzzwithtemplate;

public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        hook();
    }

    abstract void brew();

    abstract void addCondiments();

    final void boilWater() {
        System.out.println("Boiling water");
    }

    final void pourInCup() {
        System.out.println("Pouring into cup");
    }

    void hook() {

    }
}
