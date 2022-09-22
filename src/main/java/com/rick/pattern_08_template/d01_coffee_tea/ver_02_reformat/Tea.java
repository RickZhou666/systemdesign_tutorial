package com.rick.pattern_08_template.d01_coffee_tea.ver_02_reformat;

/**
 * @Author: Rick
 * @Date: 2022/9/15 22:35
 */
public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
