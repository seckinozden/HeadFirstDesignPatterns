package com.ch12.compoundpatterns;


public interface QuackObservable {
    void registerObserver(Observer observer);

    void notifyListeners();
}
