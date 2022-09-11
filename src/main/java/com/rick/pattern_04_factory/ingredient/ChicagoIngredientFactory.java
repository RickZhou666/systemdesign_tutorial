package com.rick.pattern_04_factory.ingredient;

import com.rick.pattern_04_factory.ingredient.cheese.Cheese;
import com.rick.pattern_04_factory.ingredient.cheese.MozzarellaCheese;
import com.rick.pattern_04_factory.ingredient.clams.Clams;
import com.rick.pattern_04_factory.ingredient.clams.FrozenClams;
import com.rick.pattern_04_factory.ingredient.dough.Dough;
import com.rick.pattern_04_factory.ingredient.dough.ThickCrustDought;
import com.rick.pattern_04_factory.ingredient.pepperoni.Pepperoni;
import com.rick.pattern_04_factory.ingredient.pepperoni.SlicedPepperoni;
import com.rick.pattern_04_factory.ingredient.sauce.PlumTomatoSauce;
import com.rick.pattern_04_factory.ingredient.sauce.Sauce;
import com.rick.pattern_04_factory.ingredient.veggies.BlackOlives;
import com.rick.pattern_04_factory.ingredient.veggies.EggPlant;
import com.rick.pattern_04_factory.ingredient.veggies.Spinach;
import com.rick.pattern_04_factory.ingredient.veggies.Veggies;

/**
 * @Author: Rick
 * @Date: 2022/9/9 16:03
 */
public class ChicagoIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDought();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new BlackOlives(), new Spinach(), new EggPlant()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
