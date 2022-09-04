package com.rick.pattern_01_strategy.d02_actionGame.character;

/**
 * @Author: Rick
 * @Date: 2022/9/4 22:22
 */
public class King extends Character{
    @Override
    public void fight() {
        System.out.println("I'm a King, fight for my Queen");
    }

}
