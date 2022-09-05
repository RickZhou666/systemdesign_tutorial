package com.rick.pattern_02_observer.d02_weather_station;

import com.rick.pattern_02_observer.d02_weather_station.displayer.CurrentConditionsDisplay;
import com.rick.pattern_02_observer.d02_weather_station.displayer.ForecastDisplay;
import com.rick.pattern_02_observer.d02_weather_station.displayer.HeatIndexDisplay;
import com.rick.pattern_02_observer.d02_weather_station.displayer.StatisticsDisplay;

import javax.swing.*;
import java.beans.PropertyChangeListener;

/**
 * @Author: Rick
 * @Date: 2022/9/5 22:19
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);


        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

        SwingUtilities swingUtilities;
        PropertyChangeListener propertyChangeListener;
        JButton jButton;
    }
}
