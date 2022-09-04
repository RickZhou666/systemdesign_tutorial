package com.rick.pattern_01_strategy.d02_actionGame.wepaon;

/**
 * @Author: Rick
 * @Date: 2022/9/4 22:19
 */
public class KnifeBehaviour implements WeaponBehaviour{
    @Override
    public void useWeapon() {
        System.out.println("I'm using knife");
    }
}
