package com.rick.pattern_03_decorator.d01_startbuzz.beverage.condiment;

import com.rick.pattern_03_decorator.d01_startbuzz.beverage.Beverage;

/**
 * @Author: Rick
 * @Date: 2022/9/8 09:43
 */
public abstract class CondimentDecorator extends Beverage {
    public Beverage beverage;
    @Override
    public abstract String getDescription();

    @Override
    public Size getSize() {
        return super.getSize();
    }
}
