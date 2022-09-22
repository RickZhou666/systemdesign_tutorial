package com.rick.pattern_07_adapterfacade.d01_duck;

/**
 * @Author: Rick
 * @Date: 2022/9/14 10:29
 */
public class DuckAdapter implements Turkey {
    Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();

    }

    @Override
    public void fly() {
        duck.fly();
    }
}
