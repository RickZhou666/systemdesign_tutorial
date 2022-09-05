package com.rick.pattern_02_observer.d02_weather_station.displayer;

import com.rick.pattern_02_observer.d02_weather_station.DisplayElement;
import com.rick.pattern_02_observer.d02_weather_station.Observer;
import com.rick.pattern_02_observer.d02_weather_station.WeatherData;

/**
 * @Author: Rick
 * @Date: 2022/9/5 22:22
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;

    private WeatherData weatherData;


    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast: Improving in progress!");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        display();
    }
}
