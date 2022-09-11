package com.rick.pattern_05_singleton.d06_enum_singleton;

/**
 * @Author: Rick
 * @Date: 2022/9/10 22:20
 */
public enum ChocolateBoiler {
    CHOCOLATE_BOILER;

    private boolean empty;
    private boolean boiled;

    public static ChocolateBoiler chocolateBoiler;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    // public static ChocolateBoiler getInstance() {
    //     if (chocolateBoiler == null)
    //         chocolateBoiler = new ChocolateBoiler();
    //     return chocolateBoiler;
    // }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // 往锅炉例填充牛奶和巧克力
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // 排出煮沸的牛奶和巧克力
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // 将炉内煮沸
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
