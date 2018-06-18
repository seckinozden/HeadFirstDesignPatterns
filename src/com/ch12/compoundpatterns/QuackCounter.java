package com.ch12.compoundpatterns;



public class QuackCounter implements Quackable {

    Observable observable;
    Quackable duck;
    static int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
        this.observable = new Observable(duck);
    }

    @Override
    public void quack() {
        duck.quack();
        notifyListeners();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyListeners() {
        observable.notifyListeners();
    }
}
