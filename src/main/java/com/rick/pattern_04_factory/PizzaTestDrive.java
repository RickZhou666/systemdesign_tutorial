package com.rick.pattern_04_factory;

import com.rick.pattern_04_factory.pizza_store.PizzaStore;
import com.rick.pattern_04_factory.pizza_store.chicagostore.ChicagoPizzaStore;
import com.rick.pattern_04_factory.pizza_store.nystore.NYPizzaStore;
import com.rick.pattern_04_factory.pizza_type.Pizza;

/**
 * @Author: Rick
 * @Date: 2022/9/9 10:12
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
