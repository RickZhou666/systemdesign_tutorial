package com.rick.pattern_07_adapterfacade.d04_facade.equipment;

/**
 * @Author: Rick
 * @Date: 2022/9/14 22:31
 */
public class Projector {

    StreamingPlayer player;

    public void on() {
    }

    public void off() {
    }

    public void tvMode() {
    }

    public void wideScreenMode() {
    }

    @Override
    public String toString() {
        return "Projector{" +
                "player=" + player +
                '}';
    }
}
