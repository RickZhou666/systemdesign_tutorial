package com.rick.pattern_05_singleton.d05_doublecheck_singleton;

/**
 * @Author: Rick
 * @Date: 2022/9/10 22:07
 */
public class Singleton {
    // 一个静态变量持有Singleton类唯一的实例
    private volatile static Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) { // 对Singleton class加锁
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
