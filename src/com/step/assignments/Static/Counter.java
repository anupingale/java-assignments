package com.step.assignments.Static;

public class Counter {
    private static int counter= 0;
    private int finalCount = 100;

    public Counter() {
        incrementBy(1);
    }

    public static int getCount() {
        return counter;
    }

    public static void incrementBy(int number) {
        counter += number;
    }

    public static void main(String[] args) {
        incrementBy(3);
        System.out.println(counter);
    }
}
