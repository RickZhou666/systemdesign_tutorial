package com.rick.pattern_06_command.d01_command_object.garagedoor;

/**
 * @Author: Rick
 * @Date: 2022/9/11 15:27
 */
public class GarageDoor {

    private String name;

    public GarageDoor(String name) {
        this.name = name;
    }

    public void up() {
        System.out.println(this.name + " garage door is up");
    }

    public void down() {
        System.out.println(this.name + " garage door is down");
    }

    public void stop() {
    }

    public void lightOn() {
    }

    public void lightOff() {
    }
}
