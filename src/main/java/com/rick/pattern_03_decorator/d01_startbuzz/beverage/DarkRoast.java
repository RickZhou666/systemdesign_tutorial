package com.rick.pattern_03_decorator.d01_startbuzz.beverage;

/**
 * @Author: Rick
 * @Date: 2022/9/8 09:46
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
