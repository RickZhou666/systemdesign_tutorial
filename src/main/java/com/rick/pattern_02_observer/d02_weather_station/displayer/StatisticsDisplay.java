package com.rick.pattern_02_observer.d02_weather_station.displayer;

import com.rick.pattern_02_observer.d02_weather_station.DisplayElement;
import com.rick.pattern_02_observer.d02_weather_station.Observer;
import com.rick.pattern_02_observer.d02_weather_station.WeatherData;

/**
 * @Author: Rick
 * @Date: 2022/9/5 22:21
 */
public class StatisticsDisplay implements Observer, DisplayElement {

    private float maxTemperature;
    private float minTemperature;

    private WeatherData weatherData;


    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.maxTemperature = Float.MIN_VALUE;
        this.minTemperature = Float.MAX_VALUE;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {

        System.out.println("Avg/Max/Min temperature = "
                + ((maxTemperature + minTemperature) / 2) + "/"
                + maxTemperature + "/"
                + minTemperature);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.maxTemperature = Math.max(this.maxTemperature, temperature);
        this.minTemperature = Math.min(this.minTemperature, temperature);
        display();
    }
}
