package com.rick.pattern_04_factory.pizza_type;

import com.rick.pattern_04_factory.ingredient.PizzaIngredientFactory;

/**
 * @Author: Rick
 * @Date: 2022/9/8 22:54
 */
public class CheesePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
