package com.ch12.compoundpatterns;

public class RubberDuck implements Quackable {

    Observable observable;

    public RubberDuck() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Squack");
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
