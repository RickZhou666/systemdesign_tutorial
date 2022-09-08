package com.rick.pattern_03_decorator.d01_startbuzz.beverage.condiment;

import com.rick.pattern_03_decorator.d01_startbuzz.beverage.Beverage;

/**
 * @Author: Rick
 * @Date: 2022/9/8 09:55
 */
public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    // 每个配料根据大小 改变金额
    @Override
    public double cost() {
        double cost = beverage.cost();
        if (beverage.getSize() == Size.TALL) {
            cost += .10;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += .15;
        } else if (beverage.getSize() == Size.VENTI) {
            cost += .20;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
