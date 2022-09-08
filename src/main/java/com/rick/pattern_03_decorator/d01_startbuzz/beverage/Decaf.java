package com.rick.pattern_03_decorator.d01_startbuzz.beverage;

/**
 * @Author: Rick
 * @Date: 2022/9/8 09:47
 */
public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf Coffees";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
