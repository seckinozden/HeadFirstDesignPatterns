package com.ch2.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private int temperature;
    private int humidity;
    private int pressure;

    @Override
    public void update(int temperature, int humidity, int pressure) {
        System.err.println("Current Conditions Display is being updated!");
        this.setTemperature(temperature);
        this.setHumidity(humidity);
        this.setPressure(pressure);
    }

    @Override
    public void display() {
        System.out.println("##  Current Conditions Display  ##");
        System.out.println("Temperature:" + temperature);
        System.out.println("Humidity: " + humidity);
        System.out.println("Pressure" + pressure);
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