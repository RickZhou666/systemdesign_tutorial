package com.rick.pattern_04_factory.pizza_store;

import com.rick.pattern_04_factory.pizza_type.Pizza;

/**
 * @Author: Rick
 * @Date: 2022/9/8 23:09
 */
public abstract class PizzaStore {
    // SimplePizzaFactory simplePizzaFactory;

    // public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
    //     this.simplePizzaFactory = simplePizzaFactory;
    // }

    public final Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
