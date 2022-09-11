package com.rick.pattern_06_command.d01_command_object.light;

/**
 * @Author: Rick
 * @Date: 2022/9/11 15:18
 */
public class Light {
    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void on(){
        System.out.println(this.name + " lights on");
    }

    public void off(){
        System.out.println(this.name + " lights off");
    }
}
