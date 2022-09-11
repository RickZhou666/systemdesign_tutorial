package com.rick.pattern_04_factory.pizza_store.nystore;

import com.rick.pattern_04_factory.ingredient.PizzaIngredientFactory;
import com.rick.pattern_04_factory.pizza_type.Pizza;

/**
 * @Author: Rick
 * @Date: 2022/9/9 00:03
 */
public class NYStyleClamPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public NYStyleClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {

    }
}
