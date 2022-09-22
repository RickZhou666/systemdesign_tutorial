package com.rick.pattern_07_adapterfacade.d04_facade.equipment;

/**
 * @Author: Rick
 * @Date: 2022/9/14 22:31
 */
public class StreamingPlayer {
    Amplifier amplifier;

    public void on() {
    }

    public void off() {
    }

    public void pause() {
    }

    public void play(String movie) {
    }

    public void setSurroundAudio() {

    }

    public void setTwoChannelAudio() {

    }

    public void stop() {

    }

    @Override
    public String toString() {
        return "StreamingPlayer{" +
                "amplifier=" + amplifier +
                '}';
    }
}