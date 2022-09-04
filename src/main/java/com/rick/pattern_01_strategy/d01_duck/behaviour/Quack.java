package com.rick.pattern_01_strategy.d01_duck.behaviour;

/**
 * @Author: Rick
 * @Date: 2022/9/4 17:10
 */
public class Quack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("This is how I am quack: quack! quack!");
    }
}
