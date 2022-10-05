package com.rick.pattern_12_compound.d01_duck;

import com.rick.pattern_12_compound.d03_observer.QuackObservable;

/**
 * @Author: Rick
 * @Date: 2022/9/24 10:30
 */
public interface Quackable extends QuackObservable {
    public void quack();
}
