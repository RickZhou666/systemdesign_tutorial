package com.rick.pattern_09_iterator_composition.d06_codesticker;

import com.rick.pattern_09_iterator_composition.d01_menuitem.Menu;
import com.rick.pattern_09_iterator_composition.d01_menuitem.MenuItem;

import java.util.Calendar;
import java.util.Iterator;

/**
 * @Author: Rick
 * @Date: 2022/9/21 17:16
 */
public class AlternatingDinerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] items;
    int position;

    public AlternatingDinerMenuIterator(MenuItem[] items) {
        this.items = items;
        position = Calendar.DAY_OF_WEEK % 2;
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
        position = position + 2;
        return menuItem;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Alternating Diner Menu Iterator does not support remove()");
    }
}
