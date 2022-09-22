package com.rick.pattern_07_adapterfacade.d02_enumadapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * @Author: Rick
 * @Date: 2022/9/14 22:03
 */
public class EnumerationIterator implements Iterator<Object> {

    Enumeration<?> enumeration;

    public EnumerationIterator(Enumeration<?> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
