package com.rick.pattern_09_iterator_composition.d05_cafe;

import com.rick.pattern_09_iterator_composition.d01_menuitem.Menu;
import com.rick.pattern_09_iterator_composition.d01_menuitem.MenuItem;
import com.rick.pattern_09_iterator_composition.d02_menuitemiterator.CafeMenuIterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Author: Rick
 * @Date: 2022/9/21 16:52
 */
public class CafeMenu implements Menu {
    Map<String, MenuItem> menuItems = new HashMap<>();

    public CafeMenu() {
        addItem("Veggie Burger and Air Fries",
                "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                true,
                3.99);

        addItem("Soup of the day",
                "A cup of the soup of the day, with a side salad",
                false,
                3.69);

        addItem("Burrito",
                "A large burrito, with whole pinto beans, salsa, guacamole",
                true,
                4.29);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(name, menuItem);
    }

    // public Map<String, MenuItem> getMenuItems() {
    //     return menuItems;
    // }

    @Override
    public Iterator<MenuItem> createIterator() {
        // 1. vales() return Collection
        // 2. Collection implement Iterable
        // return menuItems.values().iterator();

        return new CafeMenuIterator(menuItems).iterator();
    }
}
