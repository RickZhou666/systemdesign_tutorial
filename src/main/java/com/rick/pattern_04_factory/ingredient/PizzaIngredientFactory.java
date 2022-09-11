package com.rick.pattern_04_factory.ingredient;

import com.rick.pattern_04_factory.ingredient.cheese.Cheese;
import com.rick.pattern_04_factory.ingredient.clams.Clams;
import com.rick.pattern_04_factory.ingredient.dough.Dough;
import com.rick.pattern_04_factory.ingredient.pepperoni.Pepperoni;
import com.rick.pattern_04_factory.ingredient.sauce.Sauce;
import com.rick.pattern_04_factory.ingredient.veggies.Veggies;

/**
 * @Author: Rick
 * @Date: 2022/9/9 15:51
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
