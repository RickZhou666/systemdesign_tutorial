package com.rick.pattern_02_observer.d01_observer_class;

/**
 * @Author: Rick
 * @Date: 2022/9/5 21:14
 */
public interface Subject{
    void registerObserver();

    void removeObserver();

    void notifyObserver();
}
