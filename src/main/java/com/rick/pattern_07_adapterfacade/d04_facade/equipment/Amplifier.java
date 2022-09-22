package com.rick.pattern_07_adapterfacade.d04_facade.equipment;

/**
 * @Author: Rick
 * @Date: 2022/9/14 22:30
 */
public class Amplifier {
    Tuner tuner;
    StreamingPlayer player;

    public void on() {
    }

    public void off() {
    }

    public void setStreamingPlayer(StreamingPlayer player) {
        this.player = player;
    }

    public void setStereoSound() {

    }

    public void setSurroundSound() {

    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }

    public void setVolume(int volume) {

    }

    @Override
    public String toString() {
        return "Amplifier{" +
                "tuner=" + tuner +
                ", player=" + player +
                '}';
    }
}
