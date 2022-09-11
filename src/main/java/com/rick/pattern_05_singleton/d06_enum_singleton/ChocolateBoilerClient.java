package com.rick.pattern_05_singleton.d06_enum_singleton;

/**
 * @Author: Rick
 * @Date: 2022/9/10 22:54
 */
public class ChocolateBoilerClient {
    public static void main(String[] args) {
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.CHOCOLATE_BOILER;
        chocolateBoiler.fill();
        chocolateBoiler.drain();
        chocolateBoiler.boil();
    }
}
