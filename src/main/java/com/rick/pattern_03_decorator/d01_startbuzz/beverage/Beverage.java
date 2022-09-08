package com.rick.pattern_03_decorator.d01_startbuzz.beverage;

/**
 * @Author: Rick
 * @Date: 2022/9/8 09:12
 */
public abstract class Beverage {
    public enum Size {TALL, GRANDE, VENTI}

    Size size = Size.TALL;
    public String description = "Unknown Beverage";


    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
