package com.rick.pattern_01_strategy.d01_duck.duck;

/**
 * @Author: Rick
 * @Date: 2022/9/4 17:25
 */
public class DecoyDuck extends Duck{
    public DecoyDuck() {
    }

    @Override
    public void display() {
        System.out.println("I'm a fake duck");
    }
}
