package com.rick.pattern_04_factory.pizza_store.castore;

import com.rick.pattern_04_factory.pizza_store.PizzaStore;
import com.rick.pattern_04_factory.pizza_type.Pizza;

/**
 * @Author: Rick
 * @Date: 2022/9/9 00:04
 */
public class CAPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new CAStyleCheesePizza();
        } else if (item.equals("pepperoni")) {
            return new CAStylePepperoniPizza();
        } else if (item.equals("clam")) {
            return new CAStyleClamPizza();
        } else if (item.equals("veggie")) {
            return new CAStyleVeggiePizza();
        } else {
            return null;
        }
    }
}
