package com.rick.pattern_02_observer.d02_weather_station;

/**
 * @Author: Rick
 * @Date: 2022/9/5 22:04
 */
public interface Subject {
    // default public modifier
    public void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();
}
