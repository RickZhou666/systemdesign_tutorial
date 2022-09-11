package com.rick.pattern_04_factory.pizza_type;

import com.rick.pattern_04_factory.ingredient.PizzaIngredientFactory;

/**
 * @Author: Rick
 * @Date: 2022/9/8 22:59
 */
public class ClamPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        super.setName("Yummy Clam Pizza");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clams = ingredientFactory.createClam();
    }
}
