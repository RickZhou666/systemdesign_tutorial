package com.rick.pattern_06_command.d01_command_object.ceilingfan;

/**
 * @Author: Rick
 * @Date: 2022/9/11 16:17
 */
public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    private String location;
    private int speed;
    private String name;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println(this.location + " ceiling fan is in High speed mode");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println(this.location + " ceiling fan is in Medium speed mode");
    }

    public void low() {
        speed = LOW;
        System.out.println(this.location + " ceiling fan is in low speed mode");
    }

    public void off() {
        speed = OFF;
        System.out.println(this.location + " ceiling fan is off");
    }

    public int getSpeed() {
        return speed;
    }

    public void on() {
        System.out.println(this.location + " ceiling fan is on");
    }


}
