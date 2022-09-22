package com.rick.pattern_09_iterator_composition.d07_composite;

/**
 * @Author: Rick
 * @Date: 2022/9/21 17:48
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }
}
