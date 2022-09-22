package com.rick.pattern_08_template.d01_coffee_tea.hook;

/**
 * @Author: Rick
 * @Date: 2022/9/15 22:32
 */
public abstract class CaffeineBeverageWithHook {
    // 我们不希望子类修改这个方法，定义为final
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWithCondiments()) {
            addCondiments();
        }
    }

    // 一个钩子，子类可以覆盖这个方法
    boolean customerWithCondiments() {
        return true;
    }


    // 因为子类实现不同，设置为abstract 让子类必须改写
    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }


    void pourInCup() {
        System.out.println("Pouring into cup");
    }

}
