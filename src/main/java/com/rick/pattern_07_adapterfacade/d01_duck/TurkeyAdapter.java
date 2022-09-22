package com.rick.pattern_07_adapterfacade.d01_duck;

/**
 * @Author: Rick
 * @Date: 2022/9/14 10:08
 */
// 首先要实现适配类型的接口
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    // 接下来取得适配对象的饮用
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
