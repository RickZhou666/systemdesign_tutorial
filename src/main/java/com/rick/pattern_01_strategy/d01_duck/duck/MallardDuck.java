package com.rick.pattern_01_strategy.d01_duck.duck;

/**
 * @Author: Rick
 * @Date: 2022/9/4 16:49
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
    }

    @Override
    public void display() {
        super.display(); // invoke parent method
        System.out.println("I'm a Mallard Duck");
    }

}
