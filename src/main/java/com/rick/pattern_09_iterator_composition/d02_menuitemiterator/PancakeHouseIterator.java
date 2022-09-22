package com.rick.pattern_09_iterator_composition.d02_menuitemiterator;

import com.rick.pattern_09_iterator_composition.d01_menuitem.MenuItem;

import java.util.Iterator;
import java.util.List;


/**
 * @Author: Rick
 * @Date: 2022/9/21 09:48
 */
public class PancakeHouseIterator implements Iterator<MenuItem> {
    List<MenuItem> items;
    int position = 0;

    public PancakeHouseIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.size()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items.get(position);
        position++;
        return menuItem;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("You shouldn't be trying to remove menu items.");
    }
}
