package com.rick.pattern_12_compound.d01_duck;

/**
 * @Author: Rick
 * @Date: 2022/9/27 22:36
 */
public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
}
