package com.rick.pattern_02_observer.d02_weather_station.displayer;

import com.rick.pattern_02_observer.d02_weather_station.DisplayElement;
import com.rick.pattern_02_observer.d02_weather_station.Observer;
import com.rick.pattern_02_observer.d02_weather_station.WeatherData;
import com.rick.pattern_02_observer.d02_weather_station.WeatherStation;

/**
 * @Author: Rick
 * @Date: 2022/9/5 22:43
 */
public class HeatIndexDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;

    private WeatherData weatherData;

    public HeatIndexDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Heat Index: " + (temperature + humidity / 2));
    }

    @Override
    // public void update(float temperature, float humidity, float pressure) {
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }
}
