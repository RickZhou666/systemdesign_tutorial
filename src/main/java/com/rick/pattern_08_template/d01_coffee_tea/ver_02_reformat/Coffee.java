package com.rick.pattern_08_template.d01_coffee_tea.ver_02_reformat;

/**
 * @Author: Rick
 * @Date: 2022/9/15 22:34
 */
public class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
