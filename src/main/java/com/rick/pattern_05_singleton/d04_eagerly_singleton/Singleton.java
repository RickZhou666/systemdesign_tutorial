package com.rick.pattern_05_singleton.d04_eagerly_singleton;

/**
 * @Author: Rick
 * @Date: 2022/9/10 22:07
 */
public class Singleton {
    // 一个静态变量持有Singleton类唯一的实例
    public static Singleton uniqueInstance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return uniqueInstance;
    }
}
