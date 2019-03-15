package com.step.assignments.Static;

import static com.step.assignments.Static.Counter.incrementBy;

public class Main {
    public static void main(String[] args) {
        incrementBy(3);
        System.out.println(Counter.getCount());
    }
}
