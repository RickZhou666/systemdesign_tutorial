package com.rick.pattern_04_factory.ingredient;

import com.rick.pattern_04_factory.ingredient.cheese.Cheese;
import com.rick.pattern_04_factory.ingredient.cheese.ReggianoCheese;
import com.rick.pattern_04_factory.ingredient.clams.Clams;
import com.rick.pattern_04_factory.ingredient.clams.FreshClams;
import com.rick.pattern_04_factory.ingredient.dough.Dough;
import com.rick.pattern_04_factory.ingredient.dough.ThinCrustDough;
import com.rick.pattern_04_factory.ingredient.pepperoni.Pepperoni;
import com.rick.pattern_04_factory.ingredient.pepperoni.SlicedPepperoni;
import com.rick.pattern_04_factory.ingredient.sauce.MarinarSauce;
import com.rick.pattern_04_factory.ingredient.sauce.Sauce;
import com.rick.pattern_04_factory.ingredient.veggies.*;

/**
 * @Author: Rick
 * @Date: 2022/9/9 15:54
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinarSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
