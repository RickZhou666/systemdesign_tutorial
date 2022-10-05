package com.rick.pattern_12_compound.d03_observer;

/**
 * @Author: Rick
 * @Date: 2022/9/27 23:27
 */

// 需要一个Quackologist来接受每次duck quack
public class Quackologist implements Observer{
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck.toString() + " just quacked.");
    }
}
