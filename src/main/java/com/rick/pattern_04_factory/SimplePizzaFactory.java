package com.rick.pattern_04_factory;


import com.rick.pattern_04_factory.ingredient.ChicagoIngredientFactory;
import com.rick.pattern_04_factory.ingredient.NYPizzaIngredientFactory;
import com.rick.pattern_04_factory.pizza_type.Pizza;
import com.rick.pattern_04_factory.pizza_type.*;

/**
 * @Author: Rick
 * @Date: 2022/9/8 22:50
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.toUpperCase().equals(PizzaType.CHEESE.name())) {
            pizza = new CheesePizza(new NYPizzaIngredientFactory());
        } else if (type.toUpperCase().equals(PizzaType.PEPPERONI.name())) {
            pizza = new PepperroniPizza();
        } else if (type.toUpperCase().equals(PizzaType.CLAM.name())) {
            pizza = new ClamPizza(new ChicagoIngredientFactory());
        } else if (type.toUpperCase().equals(PizzaType.VEGGIE.name())) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
