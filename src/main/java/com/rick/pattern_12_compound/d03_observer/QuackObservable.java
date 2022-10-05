package com.rick.pattern_12_compound.d03_observer;

/**
 * @Author: Rick
 * @Date: 2022/9/27 23:01
 */
public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
