package com.rick.pattern_03_decorator.d01_startbuzz.beverage.condiment;

import com.rick.pattern_03_decorator.d01_startbuzz.beverage.Beverage;

/**
 * @Author: Rick
 * @Date: 2022/9/8 09:50
 */
public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
