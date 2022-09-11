package com.rick.pattern_05_singleton.d06_enum_singleton;

public class SingletonClient {


    // 一个静态变量持有Singleton类唯一的实例
    public static void main(String[] args) {
        Singleton singleton = Singleton.UNIQUE_INSTANCE;
    }
}
