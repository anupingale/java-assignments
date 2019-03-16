package com.step.assignments.Reduce;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;


public class Reduce {

    public static void main(String[] args) {
        Reduce r = new Reduce();
        List<Integer> list = new ArrayList<>();
        list.addAll(asList(1,2,3,4,5));
        Integer z = list.stream().reduce(10, (a, b) -> {
            System.out.println("a = "+a);
            System.out.println("b = "+b);
            return  a + b;
        }).intValue();
        System.out.println(z);
    }
}
