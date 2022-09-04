package com.rick.pattern_01_strategy.d02_actionGame.wepaon;

/**
 * @Author: Rick
 * @Date: 2022/9/4 22:21
 */
public class BowAndArrowBehaviour implements WeaponBehaviour{
    @Override
    public void useWeapon() {
        System.out.println("I'm using Bow and Arrow");
    }
}
