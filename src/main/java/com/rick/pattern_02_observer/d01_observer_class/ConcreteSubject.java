package com.rick.pattern_02_observer.d01_observer_class;

/**
 * @Author: Rick
 * @Date: 2022/9/5 21:15
 */
public class ConcreteSubject implements Subject{

    State state;

    @Override
    public void registerObserver() {

    }

    @Override
    public void removeObserver() {

    }

    @Override
    public void notifyObserver() {

    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

}
