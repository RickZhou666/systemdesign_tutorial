package com.rick.pattern_05_singleton.d01_classic_singleton;

/**
 * @Author: Rick
 * @Date: 2022/9/10 22:07
 */
public class Singleton {
    // 一个静态变量持有Singleton类唯一的实例
    public static Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton(); // 如果我们不需要这个实例，就不会被创建，这就是lazy instantiation
        }
        return uniqueInstance;
    }
}
