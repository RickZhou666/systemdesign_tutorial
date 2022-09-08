package com.rick.pattern_03_decorator.d01_startbuzz.beverage;

/**
 * @Author: Rick
 * @Date: 2022/9/8 09:45
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
