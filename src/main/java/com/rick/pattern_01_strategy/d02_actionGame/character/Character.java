package com.rick.pattern_01_strategy.d02_actionGame.character;

import com.rick.pattern_01_strategy.d02_actionGame.wepaon.WeaponBehaviour;

/**
 * @Author: Rick
 * @Date: 2022/9/4 22:18
 */
public abstract class Character {
    WeaponBehaviour weaponBehaviour;

    public void fight() {
    }

    public void chooseWeapon(WeaponBehaviour weaponBehaviour) {
        setWeaponBehaviour(weaponBehaviour);
        System.out.println("I'm using " + weaponBehaviour.toString() + " to fight");
    }

    public void setWeaponBehaviour(WeaponBehaviour weaponBehaviour) {
        this.weaponBehaviour = weaponBehaviour;
    }
}
