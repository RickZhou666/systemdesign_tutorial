package com.rick.pattern_01_strategy.d01_duck.duck;

import com.rick.pattern_01_strategy.d01_duck.behaviour.FlyBehaviour;
import com.rick.pattern_01_strategy.d01_duck.behaviour.QuackBehaviour;

/**
 * @Author: Rick
 * @Date: 2022/9/4 16:34
 */
public abstract class Duck {
    private FlyBehaviour flyBehaviour;

    private QuackBehaviour quackBehaviour;


    public void swim() {
    }

    public void display() {
        System.out.println("I'm a pure duck");
    }


    public void performFly() {
        flyBehaviour.fly();
    }


    public void performQuack() {
        quackBehaviour.quack();
    }

    public void setFlyBehaviour(FlyBehaviour replacedFlyBehaviour) {
        flyBehaviour = replacedFlyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour replacedQuackBehaviour) {
        quackBehaviour = replacedQuackBehaviour;
    }
}
