package com.rick.pattern_12_compound.d02_duck_composite;

import com.rick.pattern_01_strategy.d01_duck.behaviour.Quack;
import com.rick.pattern_12_compound.d01_duck.Quackable;
import com.rick.pattern_12_compound.d03_observer.Observable;
import com.rick.pattern_12_compound.d03_observer.Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: Rick
 * @Date: 2022/9/27 22:50
 */
public class Flock implements Quackable {
    List<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    public void quack() {
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = iterator.next();
            quacker.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()){
            Quackable duck = iterator.next();
            duck.registerObserver(observer); // 需要给内部一群鸭或者一只鸭注册
        }
    }

    @Override
    public void notifyObservers() {
        // 各自委托给duck去实现
    }


}
