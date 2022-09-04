package com.rick.pattern_01_strategy.d02_actionGame.character;

/**
 * @Author: Rick
 * @Date: 2022/9/4 22:28
 */
public class Troll extends Character{
    @Override
    public void fight() {
        System.out.println("I'm a troll, fight for my stomach");
    }

    @Override
    public String toString() {
        return "troll";
    }
}
