package com.rick.pattern_07_adapterfacade.d04_facade.equipment;

/**
 * @Author: Rick
 * @Date: 2022/9/14 22:31
 */
public class Tuner {
    Amplifier amplifier;


    public void on() {
    }

    public void off() {
    }

    public void setAm() {
    }

    public void setFm() {
    }

    public void setFrequency() {
    }

    @Override
    public String toString() {
        return "Tuner{" +
                "amplifier=" + amplifier +
                '}';
    }
}
