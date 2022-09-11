package com.rick.pattern_04_factory.pizza_type;

import com.rick.pattern_04_factory.ingredient.cheese.Cheese;
import com.rick.pattern_04_factory.ingredient.clams.Clams;
import com.rick.pattern_04_factory.ingredient.dough.Dough;
import com.rick.pattern_04_factory.ingredient.pepperoni.Pepperoni;
import com.rick.pattern_04_factory.ingredient.sauce.Sauce;
import com.rick.pattern_04_factory.ingredient.veggies.Veggies;

import java.util.Arrays;

/**
 * @Author: Rick
 * @Date: 2022/9/8 22:51
 */
public abstract class Pizza {
    public String name;
    public Dough dough;
    public Sauce sauce;
    public Veggies veggies[];
    public Cheese cheese;
    public Pepperoni pepperoni;
    public Clams clams;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clams=" + clams +
                '}';
    }
}
