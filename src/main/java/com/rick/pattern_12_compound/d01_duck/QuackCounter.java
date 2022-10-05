package com.rick.pattern_12_compound.d01_duck;

import com.rick.pattern_12_compound.d03_observer.Observable;
import com.rick.pattern_12_compound.d03_observer.Observer;

/**
 * @Author: Rick
 * @Date: 2022/9/24 10:39
 */
public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberOfQuacks;

    // QuackCounter装饰的是鸭子，应该注册duck
    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }

    @Override
    public String toString() {
        return "QuackCounter{" +
                "duck=" + duck.getClass().getSimpleName() +
                '}';
    }
}
