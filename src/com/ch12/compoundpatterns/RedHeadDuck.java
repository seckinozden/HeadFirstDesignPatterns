package com.ch12.compoundpatterns;

public class RedHeadDuck implements Quackable {

    Observable observable;

    public RedHeadDuck() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
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
