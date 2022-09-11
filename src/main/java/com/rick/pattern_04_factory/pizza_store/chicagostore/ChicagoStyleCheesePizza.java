package com.rick.pattern_04_factory.pizza_store.chicagostore;

import com.rick.pattern_04_factory.ingredient.ChicagoIngredientFactory;
import com.rick.pattern_04_factory.ingredient.PizzaIngredientFactory;
import com.rick.pattern_04_factory.pizza_type.Pizza;

/**
 * @Author: Rick
 * @Date: 2022/9/9 00:06
 */
public class ChicagoStyleCheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public ChicagoStyleCheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        // super.setName("Chicago Style Deep Dish Cheese Pizza");

        // dough = "Extra Thick Crust Dough";
        // sauce = "Plum Tomato Sauce";
        // toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        veggies = ingredientFactory.createVeggies();

    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
