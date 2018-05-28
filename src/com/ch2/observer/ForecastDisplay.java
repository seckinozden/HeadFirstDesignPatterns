package com.ch2.observer;

public class ForecastDisplay implements Observer, DisplayElement {

    private int temperature;
    private int humidity;
    private int pressure;

    @Override
    public void update(int temperature, int humidity, int pressure) {
        System.err.println("Forecast Display is being updated!");
        this.setTemperature(temperature);
        this.setHumidity(humidity);
        this.setPressure(pressure);
    }

    @Override
    public void display() {
        System.out.println("##  Forecast Display  ##");
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
