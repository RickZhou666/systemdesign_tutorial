package com.rick.pattern_01_strategy.d02_actionGame.wepaon;

import com.rick.pattern_01_strategy.d02_actionGame.character.Character;

/**
 * @Author: Rick
 * @Date: 2022/9/4 22:27
 */
public class Queen extends Character {
    @Override
    public void fight() {
        System.out.println("I'm a Queen, fight for my children");
    }
}
