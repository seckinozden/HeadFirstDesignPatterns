package com.ch2.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private int temperature;
    private int humidity;
    private int pressure;

    List<Observer> observerList;

    public WeatherData() {
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObservers(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObservers(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList)
            observer.update(temperature, humidity, pressure);
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
}
