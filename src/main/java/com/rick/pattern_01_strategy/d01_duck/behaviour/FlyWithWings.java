package com.rick.pattern_01_strategy.d01_duck.behaviour;

/**
 * @Author: Rick
 * @Date: 2022/9/4 17:08
 */
public class FlyWithWings implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("I got wings!");
    }
}
