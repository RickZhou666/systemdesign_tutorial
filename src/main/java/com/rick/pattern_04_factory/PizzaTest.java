package com.rick.pattern_04_factory;

import com.rick.pattern_04_factory.pizza_store.castore.CAPizzaStore;
import com.rick.pattern_04_factory.pizza_type.Pizza;

/**
 * @Author: Rick
 * @Date: 2022/9/8 23:00
 */
public class PizzaTest {

    public static void main(String[] args) {
        // HashMap<String, String> map = new HashMap<>();
        // for (String arg : args) {
        //     String key = arg.substring(0, arg.indexOf("="));
        //     String value = arg.substring(arg.indexOf("=") + 1);
        //     map.put(key, value);
        // }
        //
        // SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        // Pizza pizza = simplePizzaFactory.createPizza(map.get("TYPE"));
        // try {
        //     System.out.println(pizza.getClass());
        // } catch (Exception e) {
        //     throw new RuntimeException(e);
        // }
        // PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);
        // Pizza pizza2 = pizzaStore.orderPizza("ChEeSe");
        // System.out.println(pizza2.getClass());


        CAPizzaStore caPizzaStore = new CAPizzaStore();
        Pizza pizza = caPizzaStore.orderPizza("cheese");
        System.out.println(pizza);
    }
}
