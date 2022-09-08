package com.rick.pattern_03_decorator.d01_startbuzz.beverage;

/**
 * @Author: Rick
 * @Date: 2022/9/8 09:45
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
