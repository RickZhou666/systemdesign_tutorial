package com.rick.pattern_04_factory.pizza_store.chicagostore;

import com.rick.pattern_04_factory.ingredient.ChicagoIngredientFactory;
import com.rick.pattern_04_factory.ingredient.PizzaIngredientFactory;
import com.rick.pattern_04_factory.pizza_store.PizzaStore;
import com.rick.pattern_04_factory.pizza_type.Pizza;

/**
 * @Author: Rick
 * @Date: 2022/9/9 00:04
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoIngredientFactory();
        if (item.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (item.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else if (item.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else {
            return null;
        }
        return pizza;
    }
}
