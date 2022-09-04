package com.rick.pattern_01_strategy.d01_duck;

import com.rick.pattern_01_strategy.d01_duck.behaviour.FlyWithRocketEngine;
import com.rick.pattern_01_strategy.d01_duck.behaviour.MuteQuack;
import com.rick.pattern_01_strategy.d01_duck.behaviour.Quack;
import com.rick.pattern_01_strategy.d01_duck.duck.MallardDuck;
import com.rick.pattern_01_strategy.d01_duck.duck.RubberDuck;

/**
 * @Author: Rick
 * @Date: 2022/9/4 16:55
 */
public class TestDuck {
    public static void main(String[] args) {
        // Mallard Duck
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.setQuackBehaviour(new Quack());
        mallardDuck.performQuack();
        mallardDuck.setFlyBehaviour(new FlyWithRocketEngine());
        mallardDuck.performFly();

        System.out.println("\n===================================");
        // Rubber Duck
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.setQuackBehaviour(new MuteQuack());
        rubberDuck.display();
        rubberDuck.performQuack();

    }
}
