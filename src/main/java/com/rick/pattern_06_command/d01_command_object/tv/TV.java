package com.rick.pattern_06_command.d01_command_object.tv;

/**
 * @Author: Rick
 * @Date: 2022/9/11 17:28
 */
public class TV {
    private String name;

    public TV(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println("TV is on");
    }

    public void off() {
        System.out.println("TV is off");

    }
}
