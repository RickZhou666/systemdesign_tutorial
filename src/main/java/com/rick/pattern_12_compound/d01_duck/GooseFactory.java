package com.rick.pattern_12_compound.d01_duck;

/**
 * @Author: Rick
 * @Date: 2022/9/27 22:44
 */
public class GooseFactory extends AbstractGooseFactory{
    @Override
    public Quackable createGoose() {
        return new GooseAdapter(new Goose());
    }
}
