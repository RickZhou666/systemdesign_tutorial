package com.rick.pattern_08_template.d01_coffee_tea.ver_02_reformat;

/**
 * @Author: Rick
 * @Date: 2022/9/15 22:38
 */
public class CaffeineBeverageTest {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Tea tea = new Tea();
        coffee.prepareRecipe();
        System.out.println("\n");
        tea.prepareRecipe();
    }
}
