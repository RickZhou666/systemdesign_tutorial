package com.rick.pattern_08_template.d01_coffee_tea.ver_01_original;

/**
 * @Author: Rick
 * @Date: 2022/9/15 22:30
 */
public class Tea {
    void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    public void boilWater() {
        System.out.println("Boiling water");
    }

    private void steepTeaBag() {
        System.out.println("Steeping the tea");
    }


    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    private void addLemon() {
        System.out.println("Adding Lemon");
    }
}
