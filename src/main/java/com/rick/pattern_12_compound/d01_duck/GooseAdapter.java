package com.rick.pattern_12_compound.d01_duck;

import com.rick.pattern_12_compound.d03_observer.Observable;
import com.rick.pattern_12_compound.d03_observer.Observer;

/**
 * @Author: Rick
 * @Date: 2022/9/24 10:32
 */
public class GooseAdapter implements Quackable {

    Observable observable;

    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();
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
        return "GooseAdapter{" +
                "goose=" + goose.getClass().getSimpleName() +
                '}';
    }
}
