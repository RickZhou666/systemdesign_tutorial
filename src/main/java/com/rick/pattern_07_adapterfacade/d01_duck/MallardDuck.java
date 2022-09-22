package com.rick.pattern_07_adapterfacade.d01_duck;

/**
 * @Author: Rick
 * @Date: 2022/9/14 10:05
 */
public class MallardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
