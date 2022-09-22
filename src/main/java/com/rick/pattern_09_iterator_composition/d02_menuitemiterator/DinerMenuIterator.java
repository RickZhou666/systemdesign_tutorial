package com.rick.pattern_09_iterator_composition.d02_menuitemiterator;

import com.rick.pattern_09_iterator_composition.d01_menuitem.MenuItem;

import java.util.Iterator;

/**
 * @Author: Rick
 * @Date: 2022/9/21 09:24
 */
public class DinerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }
}
