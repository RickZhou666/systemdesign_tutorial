package com.rick.pattern_06_command.d01_command_object.stereo;

/**
 * @Author: Rick
 * @Date: 2022/9/11 16:09
 */
public class Stereo {
    private int volume = 5;
    private String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(this.name + " stereo is on");
    }

    public void off() {
        System.out.println(this.name + " stereo is off");
    }


    public void setCd() {
        System.out.println(this.name + " stereo set CD completed");
    }


    public void setDvd() {
    }


    public void setRadio() {
    }


    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(this.name + " currently volume is " + this.volume);
    }
}
