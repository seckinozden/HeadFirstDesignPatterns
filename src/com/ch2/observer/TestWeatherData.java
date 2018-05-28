package com.ch2.observer;

public class TestWeatherData {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();

        weatherData.registerObservers(currentConditionsDisplay);
        weatherData.registerObservers(forecastDisplay);

        weatherData.setTemperature(30);
        weatherData.setHumidity(12);
        weatherData.setPressure(21);
        weatherData.notifyObservers();

        currentConditionsDisplay.display();

        weatherData.registerObservers(statisticsDisplay);
        weatherData.removeObservers(forecastDisplay);

        weatherData.setTemperature(32);
        weatherData.setHumidity(10);
        weatherData.setPressure(20);
        weatherData.notifyObservers();

        statisticsDisplay.display();
    }
}
