package com.ch2.observer;

public interface Subject {

    void registerObservers(Observer observer);
    void removeObservers(Observer observer);
    void notifyObservers();
}
