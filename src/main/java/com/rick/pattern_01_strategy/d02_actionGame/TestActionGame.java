package com.rick.pattern_01_strategy.d02_actionGame;

import com.rick.pattern_01_strategy.d02_actionGame.character.Character;
import com.rick.pattern_01_strategy.d02_actionGame.character.King;
import com.rick.pattern_01_strategy.d02_actionGame.character.Knight;
import com.rick.pattern_01_strategy.d02_actionGame.character.Troll;
import com.rick.pattern_01_strategy.d02_actionGame.wepaon.*;

import java.util.Observer;

/**
 * @Author: Rick
 * @Date: 2022/9/4 22:24
 */
public class TestActionGame {
    public static void main(String[] args) {
        System.out.println("====================King====================");
        King king = new King();
        king.fight();
        king.chooseWeapon(new SwordBehaviour());
        System.out.println("\n");

        System.out.println("====================Queen====================");
        Queen queen = new Queen();
        queen.fight();
        queen.chooseWeapon(new BowAndArrowBehaviour());
        System.out.println("\n");

        System.out.println("====================Knight====================");
        Knight knight = new Knight();
        knight.fight();
        knight.chooseWeapon(new KnifeBehaviour());
        System.out.println("\n");

        System.out.println("====================Troll====================");
        Troll troll = new Troll();
        troll.fight();
        troll.chooseWeapon(new AxeBehaviour());
        System.out.println("\n");


        if (troll instanceof Character) {
            System.out.println(troll.toString() + " is instance of Character");
        } else {
            System.out.println(troll.toString() + " is not instance of Character");
        }

        if (troll instanceof Observer) {
            System.out.println(troll.toString() + " is instance of Observer");
        } else {
            System.out.println(troll.toString() + " is not instance of Observer");
        }
    }
}
