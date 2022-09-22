package com.rick.pattern_08_template.d01_coffee_tea.hook;

/**
 * @Author: Rick
 * @Date: 2022/9/15 23:14
 */
public class BeverageTestDrive {
    public static void main(String[] args) {
        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();
        System.out.println("\nMaking tea..");
        teaHook.prepareRecipe();


        System.out.println("\nMaking coffee..");
        coffeeHook.prepareRecipe();
    }
}
