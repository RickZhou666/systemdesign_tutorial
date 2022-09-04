package com.rick.pattern_01_strategy.d01_duck.duck;

/**
 * @Author: Rick
 * @Date: 2022/9/4 17:26
 */
public class RubberDuck extends Duck{
    public RubberDuck() {
    }

    @Override
    public void display() {
        System.out.println("I'm a RUBBER DUCK");
    }
}
