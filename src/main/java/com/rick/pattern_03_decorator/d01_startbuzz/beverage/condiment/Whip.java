package com.rick.pattern_03_decorator.d01_startbuzz.beverage.condiment;

import com.rick.pattern_03_decorator.d01_startbuzz.beverage.Beverage;

/**
 * @Author: Rick
 * @Date: 2022/9/8 09:56
 */
public class Whip extends CondimentDecorator{
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
