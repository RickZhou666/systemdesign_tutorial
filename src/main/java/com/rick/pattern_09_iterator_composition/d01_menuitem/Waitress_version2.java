package com.rick.pattern_09_iterator_composition.d01_menuitem;

// import com.rick.pattern_09_iterator_composition.d02_menuitemiterator.Iterator;


import java.util.Iterator;
import java.util.List;

/**
 * @Author: Rick
 * @Date: 2022/9/21 09:10
 */
public class Waitress_version2 {
    List<Menu> menus;


    public Waitress_version2(List<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        Iterator<Menu> menuIterator = menus.iterator();
        while (menuIterator.hasNext()) {
            Iterator<MenuItem> menu = menuIterator.next().createIterator();
            printMenu(menu);
        }
    }


    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
        System.out.println("\n");
    }

}
