package com.rick.pattern_12_compound.d03_observer;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: Rick
 * @Date: 2022/9/27 23:03
 */
public class Observable implements QuackObservable{
    List<Observer> observers = new ArrayList<>();
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()){
            Observer observer = (Observer) iterator.next();
            observer.update(duck); // 传入正在叫的duck
        }
    }
}
