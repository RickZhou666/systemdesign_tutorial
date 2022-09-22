package com.rick.pattern_07_adapterfacade.d01_duck;

/**
 * @Author: Rick
 * @Date: 2022/9/14 10:06
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
