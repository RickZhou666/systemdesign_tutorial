package com.rick.pattern_12_compound.d01_duck;

import com.rick.pattern_12_compound.d03_observer.Observable;
import com.rick.pattern_12_compound.d03_observer.Observer;

/**
 * @Author: Rick
 * @Date: 2022/9/24 10:30
 */
public class MallardDuck implements Quackable{
    Observable observable;


    public MallardDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "MallardDuck";
    }
}
