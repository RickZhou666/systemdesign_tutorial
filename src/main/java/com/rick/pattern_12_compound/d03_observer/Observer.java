package com.rick.pattern_12_compound.d03_observer;

/**
 * @Author: Rick
 * @Date: 2022/9/27 23:09
 */
// 主题subject
public interface Observer {
    public void update(QuackObservable duck);
}
