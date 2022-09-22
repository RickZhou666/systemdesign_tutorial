package com.rick.pattern_08_template.d01_coffee_tea.ver_01_original;

/**
 * @Author: Rick
 * @Date: 2022/9/15 22:26
 */
public class Coffee {
    void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    public void boilWater() {
        System.out.println("Boiling water");
    }

    private void brewCoffeeGrinds() {
        System.out.println("Dripping Coffee through filter");
    }


    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    private void addSugarAndMilk() {
        System.out.println("Adding Sugar and Milk");
    }

}
