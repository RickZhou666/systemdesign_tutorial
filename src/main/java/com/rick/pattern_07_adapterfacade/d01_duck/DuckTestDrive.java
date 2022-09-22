package com.rick.pattern_07_adapterfacade.d01_duck;

/**
 * @Author: Rick
 * @Date: 2022/9/14 10:11
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);


        DuckAdapter duckAdapter = new DuckAdapter(duck);
        System.out.println("\nThe DuckAdapter says...");
        testTurkey(duckAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }


    private static void testTurkey(Turkey turkey) {
        turkey.gobble();
        turkey.fly();
    }
}

