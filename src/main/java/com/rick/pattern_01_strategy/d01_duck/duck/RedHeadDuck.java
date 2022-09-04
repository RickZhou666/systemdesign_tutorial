package com.rick.pattern_01_strategy.d01_duck.duck;

/**
 * @Author: Rick
 * @Date: 2022/9/4 17:07
 */
public class RedHeadDuck extends Duck{
    public RedHeadDuck() {
    }

    @Override
    public void display() {
        System.out.println("I'm  a red head duck");
    }
}
