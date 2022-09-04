package com.rick.pattern_01_strategy.d01_duck.behaviour;

/**
 * @Author: Rick
 * @Date: 2022/9/4 17:11
 */
public class MuteQuack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Cannot Quack!");
    }
}
